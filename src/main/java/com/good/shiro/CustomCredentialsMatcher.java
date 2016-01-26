package com.good.shiro;

import com.good.utils.MD5Util;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * CustomCredentialsMatcher
 *
 * @Description: uuuuuuuuuuuuuuuuu
 * @Author: tretert
 * @Time:
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {

        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        Object tokenCredentials = MD5Util.md5(String.valueOf(userToken.getPassword()));
        Object accountCredentials = getCredentials(info);
        return equals(tokenCredentials, accountCredentials);
    }

}

/*class A{
    private int n1 = 2;
    public void f(){
        System.out.println(n1+"==========");
    }
}

class B extends A{
    public void ff(){
        f();
    }

    public void f(){
        System.out.println("33333333333333x");
    }
}

public class CustomCredentialsMatcher{
    public static void main(String[] args){
        new B().ff();
    }
}*/

