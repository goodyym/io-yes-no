package com.good.realm;

import com.good.model.User;
import com.good.service.LoginService1;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.security.util.Password;

/**
 * myrealm
 *
 * @Description: uuuuuuuuuuuuuuuuu
 * @Author: tretert
 * @Time:1
 */
@Component
public class myrealm extends AuthorizingRealm{

    @Autowired
    LoginService1 loginService1;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

//        String tokenUserName = authenticationToken.getPrincipal().toString();

        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)authenticationToken;
        String tokenUserName = usernamePasswordToken.getUsername();
        String password = "";
        if(tokenUserName!=null){
            password = loginService1.getUserByName(tokenUserName).getPassword();
        }

        return new SimpleAuthenticationInfo(tokenUserName, password,getName());
    }
}
