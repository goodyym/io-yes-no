package com.good.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String userLogin(){
        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}
