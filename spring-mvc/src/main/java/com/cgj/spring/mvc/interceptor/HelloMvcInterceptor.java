package com.cgj.spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器可以处理Web应用中请求的一些通用性问题，如：乱码问题，用户登录状态验证
 * 
 * 拦截器实现方式：实现HandlerIntercetor或者WebRequestInterceptor
 * （两种方式向spring mvc框架注册的方式是一致的，
 *   但是WebRequestInterceptor的preHandle方法没有返回值不能终止请求）
 *
 */
public class HelloMvcInterceptor implements HandlerInterceptor{

    /**
     * 返回值表示我们是否需要将当前请求拦截下来
     * Object arg2 表示当前拦截请求的目标对象
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("开始执行preHandle方法！");
        if(request.getSession().getAttribute("userName") == null){
            //如果用户没有登陆，就终止请求，并发送到登陆页面
            //request.getRequestDispatcher("/login.jsp").forward(request, response);
            //return false;
        }
        return true;
    }

    /**
     * 可以通过ModelAndView参数来改变显示的视图，或修改发往视图的方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("开始执行postHandle方法！");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("开始执行afterCompletion方法！");
    }

}
