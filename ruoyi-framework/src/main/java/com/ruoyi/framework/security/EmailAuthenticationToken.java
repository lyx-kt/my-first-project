package com.ruoyi.framework.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * 邮箱认证Token
 */
public class EmailAuthenticationToken extends AbstractAuthenticationToken {
    private final Object principal; // 邮箱
    private Object credentials;     // 密码

    /**
     * 未认证的构造函数
     */
    public EmailAuthenticationToken(String email, String password) {
        super(null);
        this.principal  = email;
        this.credentials  = password;
        setAuthenticated(false);
    }

    /**
     * 已认证的构造函数
     */
    public EmailAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
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
