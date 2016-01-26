package com.good.realm;

import com.good.model.GoodPermission;
import com.good.model.GoodRole;
import com.good.model.GoodUser;
import com.good.service.GoodPermissionService;
import com.good.service.GoodRoleService;
import com.good.service.UserLoginService;
import com.good.shiro.CustomCredentialsMatcher;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

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

    /*@Autowired
    GoodRoleService goodRoleService;

    @Autowired
    GoodPermissionService goodPermissionService;*/

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String username = (String)principalCollection.getPrimaryPrincipal();
        GoodUser user = userLoginService.getUserByName(username);
        List<GoodRole> listRole = null;
        List<GoodPermission> listPermission = null;
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        /*if(user != null){
            listRole = goodRoleService.getRoleByUser(user.getId());
        }

        if(listRole != null){
            for(GoodRole goodRole:listRole){
                listPermission = goodPermissionService.getPermissionByRole(goodRole.getId());
                if(listPermission != null){
                    for(GoodPermission goodPermission:listPermission){
                        info.addStringPermission(goodPermission.getUrl());
                    }
                }
            }
        }*/
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)authenticationToken;

        String tokenUserName = usernamePasswordToken.getUsername();
        String password = "";
        if(tokenUserName!=null){
            password = userLoginService.getUserByName(tokenUserName).getPassword();
        }

        return new SimpleAuthenticationInfo(tokenUserName, password,getName());
    }


    //类收到DI容器初始化的时候，执行此方法，做一些初始化操作
    @PostConstruct
    public void initCredentialsMacther(){
        setCredentialsMatcher(new CustomCredentialsMatcher());
    }


}
