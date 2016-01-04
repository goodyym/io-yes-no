package com.good.filters;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator
 * Date:2016/1/1
 */
public class TestFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getFilterName()+"===filterName");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println(servletRequest.getParameter("username")+"===========username");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("====destroy!");
    }
}
