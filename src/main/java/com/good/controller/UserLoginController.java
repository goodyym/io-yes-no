package com.good.controller;

import org.apache.commons.logging.impl.ServletContextCleaner;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


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

    @RequestMapping("/userLogin")
    public String userLogin(HttpServletRequest request){
        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome(HttpServletRequest request){
        HttpSession ss2 = request.getSession();
        ss2.setAttribute("yy","mmmValue111");


        System.out.println(ss2.getId()+"======welcome====sessionId");

        System.out.println(ss2.getAttribute("yy")+"===welcome");


        return "welcome";
    }

    @RequestMapping("/welcome2")
    public void welcome2(HttpServletRequest request){
        HttpSession ss2 = request.getSession();

        System.out.println(ss2.getId()+"======welcome2222222====sessionId");

        System.out.println(ss2.getAttribute("yy")+"===welcome2222222");


    }

}
