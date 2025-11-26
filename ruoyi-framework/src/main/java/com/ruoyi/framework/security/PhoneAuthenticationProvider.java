package com.ruoyi.framework.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PhoneAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) {
        String phone = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        // 通过手机号查询用户
        UserDetails userDetails = userDetailsService.loadUserByUsername(phone);
        if (userDetails == null) throw new BadCredentialsException("手机号不存在");

        // 验证密码
        if (!passwordEncoder.matches(password,  userDetails.getPassword()))  {
            throw new BadCredentialsException("密码错误");
        }

        // 返回认证成功的Token
        return new PhoneAuthenticationToken(userDetails, password, userDetails.getAuthorities());
    }



    @Override
    public boolean supports(Class<?> authentication) {
        return PhoneAuthenticationToken.class.isAssignableFrom(authentication);
    }


}

