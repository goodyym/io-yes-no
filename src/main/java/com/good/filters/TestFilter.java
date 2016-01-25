package com.good.filters;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Administrator
 * Date:2016/1/1
 */
public class TestFilter implements Filter {

    String encoding = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getFilterName()+"===filterName");
        System.out.println(filterConfig.getInitParameter("encoding")+"=============encoding!");

        this.encoding = filterConfig.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println(servletRequest.getParameter("username")+"===========username");
        HttpServletRequest req = (HttpServletRequest)servletRequest;

        System.out.println(req.getCharacterEncoding()+"=========getCharacterEncoding");
        req.setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println(req.getRequestURI()+"====aftersssssssssssssssssss===========");
        System.out.println(req.getRequestURL()+"====aftersssssssssssssssssss===========");
    }

    public void destroy() {
        System.out.println("====destroy!");
    }
}
