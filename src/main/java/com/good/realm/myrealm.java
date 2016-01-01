package com.good.realm;

import com.good.service.UserLoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    UserLoginService userLoginService;

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
            password = userLoginService.getUserByName(tokenUserName).getPassword();
        }

        return new SimpleAuthenticationInfo(tokenUserName, password,getName());
    }
}
