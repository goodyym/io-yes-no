package com.good.controller;

import com.good.model.GoodUser;
import com.good.model.Page;
import com.good.model.TestPageModel;
import com.good.service.ListPageService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.impl.ServletContextCleaner;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;


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


    private Page<TestPageModel> page = new Page<TestPageModel>(3);

    @Autowired
    ListPageService listPageService;

    @RequestMapping("/userLogin")
    public String userLogin(HttpServletRequest request){
        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome(HttpServletRequest request,Map map){
       /* HttpSession ss2 = request.getSession();
        ss2.setAttribute("yy","mmmValue111");
        System.out.println(ss2.getId()+"======welcome====sessionId");
        System.out.println(ss2.getAttribute("yy")+"===welcome");*/

        String pageNo = request.getParameter("pageNo");
        int pageNoInt = 1;
        if(StringUtils.isNotBlank(pageNo)){
            pageNoInt = Integer.parseInt(pageNo);
        }
        setPageNo(pageNoInt);
        Map<String,Object> params = new HashMap<String, Object>();
        page = listPageService.getListPage(params,page);
        map.put("page", page);

        return "welcome";
    }

    @RequestMapping(value = "/welcome2")
    public String welcome2(HttpServletRequest request){

    return "welcome2";
    }

    @ResponseBody
    @RequestMapping(value="/welcome2Ajax",method = { RequestMethod.GET, RequestMethod.POST })
    public Map<String,Object> welcome2Ajax(HttpServletRequest request){

        String pageNo = request.getParameter("pageNo");
        int pageNoInt = 1;
        if(StringUtils.isNotBlank(pageNo)){
            pageNoInt = Integer.parseInt(pageNo);
        }
        setPageNo(pageNoInt);
        Map<String,Object> params = new HashMap<String, Object>();
        page = listPageService.getListPage(params,page);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("page",page);
        return map;


    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletResponse response,PrintWriter pw){

        String str = "{\"aa\":\"bb\"}";
        pw.write("sfdsfwer21");
    }


    public void setPageNo(int pageNo){
        page.setPageNo(pageNo);
    }


    public Page<TestPageModel> getPage() {
        return page;
    }

    public void setPage(Page<TestPageModel> page) {
        this.page = page;
    }
}
