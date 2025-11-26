package com.ruoyi.framework.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ruoyi.common.constant.CacheConstants;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.RegisterBody;
import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.common.exception.user.CaptchaException;
import com.ruoyi.common.exception.user.CaptchaExpireException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.MessageUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.manager.AsyncManager;
import com.ruoyi.framework.manager.factory.AsyncFactory;
import com.ruoyi.system.service.ISysConfigService;
import com.ruoyi.system.service.ISysUserService;

/**
 * 注册校验方法
 * 
 * @author ruoyi
 */
@Component
public class SysRegisterService
{
    @Autowired
    private ISysUserService userService;

    @Autowired
    private ISysConfigService configService;

    @Autowired
    private RedisCache redisCache;

    /**
     * 注册
     */
    public String register(RegisterBody registerBody)
    {
        String msg = "";
        String registerType = registerBody.getRegisterType();
        String username = registerBody.getUsername();
        String phone = registerBody.getPhone();
        String email = registerBody.getEmail();
        String password = registerBody.getPassword();
        
        // 根据注册类型获取主要标识
        String mainIdentifier = username;
        if ("phone".equals(registerType)) {
            mainIdentifier = phone;
        } else if ("email".equals(registerType)) {
            mainIdentifier = email;
        }
        
        SysUser sysUser = new SysUser();

        // 验证码开关
        boolean captchaEnabled = configService.selectCaptchaEnabled();
        if (captchaEnabled)
        {
            validateCaptcha(mainIdentifier, registerBody.getCode(), registerBody.getUuid());
        }

        // 根据注册类型进行不同的验证
        if ("phone".equals(registerType)) {
            // 手机号注册
            String phoneCode = registerBody.getPhoneCode();
            
            if (StringUtils.isEmpty(phone))
            {
                msg = "手机号不能为空";
            }
            else if (phone.length() < 5 || phone.length() > 15)
            {
                msg = "手机号长度必须在5到15位之间";
            }
            else if (!phone.matches("^\\d+$"))
            {
                msg = "手机号只能包含数字";
            }
            else if (StringUtils.isEmpty(password))
            {
                msg = "用户密码不能为空";
            }
            else if (password.length() < 6 || password.length() > UserConstants.PASSWORD_MAX_LENGTH)
            {
                msg = "密码长度必须在6到20个字符之间";
            }
            else {
                // 完整手机号（包含区号）
                String fullPhone = StringUtils.isNotEmpty(phoneCode) ? phoneCode + phone : phone;
                
                // 检查手机号是否已注册
                sysUser.setPhonenumber(fullPhone);
                if (!userService.checkPhoneUnique(sysUser))
                {
                    msg = "注册失败，该手机号已被注册";
                }
                else
                {
                    // 生成默认用户名（使用时间戳保证唯一性）
                    String timestamp = String.valueOf(System.currentTimeMillis()).substring(7);
                    sysUser.setUserName("user_" + phone + "_" + timestamp);
                    sysUser.setNickName("用户" + phone.substring(Math.max(0, phone.length() - 4)));
                    sysUser.setPhonenumber(fullPhone);
                    sysUser.setPwdUpdateDate(DateUtils.getNowDate());
                    sysUser.setPassword(SecurityUtils.encryptPassword(password));
                    boolean regFlag = userService.registerUser(sysUser);
                    if (!regFlag)
                    {
                        msg = "注册失败,请联系系统管理人员";
                    }
                    else
                    {
                        AsyncManager.me().execute(AsyncFactory.recordLogininfor(fullPhone, Constants.REGISTER, MessageUtils.message("user.register.success")));
                    }
                }
            }
        }
        else if ("email".equals(registerType)) {
            // 邮箱注册
            if (StringUtils.isEmpty(email))
            {
                msg = "邮箱不能为空";
            }
            else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
            {
                msg = "邮箱格式不正确";
            }
            else if (StringUtils.isEmpty(password))
            {
                msg = "用户密码不能为空";
            }
            else if (password.length() < 6 || password.length() > UserConstants.PASSWORD_MAX_LENGTH)
            {
                msg = "密码长度必须在6到20个字符之间";
            }
            else {
                // 检查邮箱是否已注册
                sysUser.setEmail(email);
                if (!userService.checkEmailUnique(sysUser))
                {
                    msg = "注册失败，该邮箱已被注册";
                }
                else
                {
                    // 生成默认用户名
                    String emailPrefix = email.substring(0, email.indexOf("@"));
                    sysUser.setUserName("user_" + emailPrefix);
                    sysUser.setNickName(emailPrefix);
                    sysUser.setEmail(email);
                    sysUser.setPwdUpdateDate(DateUtils.getNowDate());
                    sysUser.setPassword(SecurityUtils.encryptPassword(password));
                    boolean regFlag = userService.registerUser(sysUser);
                    if (!regFlag)
                    {
                        msg = "注册失败,请联系系统管理人员";
                    }
                    else
                    {
                        AsyncManager.me().execute(AsyncFactory.recordLogininfor(email, Constants.REGISTER, MessageUtils.message("user.register.success")));
                    }
                }
            }
        }
        else {
            // 用户名注册（默认方式）
            if (StringUtils.isEmpty(username))
            {
                msg = "用户名不能为空";
            }
            else if (StringUtils.isEmpty(password))
            {
                msg = "用户密码不能为空";
            }
            else if (username.length() < UserConstants.USERNAME_MIN_LENGTH
                    || username.length() > UserConstants.USERNAME_MAX_LENGTH)
            {
                msg = "账户长度必须在2到20个字符之间";
            }
            else if (password.length() < UserConstants.PASSWORD_MIN_LENGTH
                    || password.length() > UserConstants.PASSWORD_MAX_LENGTH)
            {
                msg = "密码长度必须在5到20个字符之间";
            }
            else {
                sysUser.setUserName(username);
                if (!userService.checkUserNameUnique(sysUser))
                {
                    msg = "保存用户'" + username + "'失败，注册账号已存在";
                }
                else
                {
                    sysUser.setNickName(username);
                    sysUser.setPwdUpdateDate(DateUtils.getNowDate());
                    sysUser.setPassword(SecurityUtils.encryptPassword(password));
                    boolean regFlag = userService.registerUser(sysUser);
                    if (!regFlag)
                    {
                        msg = "注册失败,请联系系统管理人员";
                    }
                    else
                    {
                        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.REGISTER, MessageUtils.message("user.register.success")));
                    }
                }
            }
        }
        return msg;
    }

    /**
     * 校验验证码
     * 
     * @param username 用户名
     * @param code 验证码
     * @param uuid 唯一标识
     * @return 结果
     */
    public void validateCaptcha(String username, String code, String uuid)
    {
        String verifyKey = CacheConstants.CAPTCHA_CODE_KEY + StringUtils.nvl(uuid, "");
        String captcha = redisCache.getCacheObject(verifyKey);
        redisCache.deleteObject(verifyKey);
        if (captcha == null)
        {
            throw new CaptchaExpireException();
        }
        if (!code.equalsIgnoreCase(captcha))
        {
            throw new CaptchaException();
        }
    }
}
