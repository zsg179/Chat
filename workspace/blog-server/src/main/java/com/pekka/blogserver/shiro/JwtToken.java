package com.pekka.blogserver.shiro;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Auther :朱树广
 * @Date :2020/6/18
 * @Description :com.pekka.blogserver.shiro
 * @Version :1.0
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
