package com.good.controller;

import com.good.SS;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

/**
 * LoginController
 *
 * @Description: uuuuuuuuuuuuuuuuu
 * @Author: tretert
 * @Time:1
 */

@Controller
@RequestMapping("/login")
public class UserLoginController {

    @Autowired
    SS ss;

    @RequestMapping("/userLogin")
    public String userLogin(){
        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome(){
//        Subject sb = SecurityUtils.getSubject();
//
//        String str = "hello";
//        String str1 = Base64.encodeToString(str.getBytes());
//        System.out.println(str1+"=============");
//        String str2 = Base64.decodeToString(str1);
//        System.out.println(str2+"....................");


        ss.b();

        return "welcome";
    }

}
