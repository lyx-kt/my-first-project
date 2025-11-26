package com.ruoyi.framework.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

// 手机号认证Token
public class PhoneAuthenticationToken extends AbstractAuthenticationToken {
    private final Object principal; // 手机号
    private Object credentials;     // 密码

    public PhoneAuthenticationToken(String phone, String password) {
        super(null);
        this.principal  = phone;
        this.credentials  = password;
        setAuthenticated(false);
    }

    public PhoneAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.principal = principal;
        this.credentials = credentials;
        super.setAuthenticated(true);
    }

    @Override
    public Object getCredentials() { return credentials; }
    @Override
    public Object getPrincipal() { return principal; }
}

