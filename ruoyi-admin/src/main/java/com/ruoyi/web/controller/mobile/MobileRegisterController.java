package com.ruoyi.web.controller.mobile;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.RegisterBody;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.web.service.SysRegisterService;
import com.ruoyi.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 移动端注册验证
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/mobile")
public class MobileRegisterController extends BaseController
{
    @Autowired
    private SysRegisterService registerService;

    @Autowired
    private ISysConfigService configService;

    /**
     * 移动端注册
     */
    @PostMapping("/register")
    public AjaxResult register(@RequestBody RegisterBody registerBody)
    {
        // 检查是否开启注册功能
        if (!("true".equals(configService.selectConfigByKey("sys.account.registerUser"))))
        {
            return error("当前系统没有开启注册功能！");
        }

        // 验证注册类型
        String registerType = registerBody.getRegisterType();
        if (StringUtils.isEmpty(registerType))
        {
            return error("请选择注册方式");
        }

        // 验证必填字段
        if ("phone".equals(registerType))
        {
            // 手机号注册验证
            if (StringUtils.isEmpty(registerBody.getPhone()))
            {
                return error("手机号不能为空");
            }
            if (StringUtils.isEmpty(registerBody.getPhoneCode()))
            {
                return error("请选择国家/地区");
            }
            if (StringUtils.isEmpty(registerBody.getPassword()))
            {
                return error("密码不能为空");
            }
            if (registerBody.getPassword().length() < 6)
            {
                return error("密码长度不能少于6位");
            }
        }
        else if ("email".equals(registerType))
        {
            // 邮箱注册验证
            if (StringUtils.isEmpty(registerBody.getEmail()))
            {
                return error("邮箱不能为空");
            }
            if (StringUtils.isEmpty(registerBody.getPassword()))
            {
                return error("密码不能为空");
            }
            if (registerBody.getPassword().length() < 6)
            {
                return error("密码长度不能少于6位");
            }
        }
        else
        {
            return error("不支持的注册方式");
        }

        // 执行注册
        String msg = registerService.register(registerBody);
        return StringUtils.isEmpty(msg) ? success("注册成功") : error(msg);
    }

    /**
     * 验证手机号是否已注册
     */
    @GetMapping("/check/phone")
    public AjaxResult checkPhone(@RequestParam("phone") String phone, 
                                  @RequestParam(value = "phoneCode", required = false) String phoneCode)
    {
        if (StringUtils.isEmpty(phone))
        {
            return error("手机号不能为空");
        }
        
        // 这里可以调用userService检查手机号是否已存在
        // 暂时返回未注册
        return success();
    }

    /**
     * 验证邮箱是否已注册
     */
    @GetMapping("/check/email")
    public AjaxResult checkEmail(@RequestParam("email") String email)
    {
        if (StringUtils.isEmpty(email))
        {
            return error("邮箱不能为空");
        }
        
        // 这里可以调用userService检查邮箱是否已存在
        // 暂时返回未注册
        return success();
    }
}
