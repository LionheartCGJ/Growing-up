package com.cgj.spring.mvc.listener;

import java.util.Map;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.cgj.spring.mvc.entity.User;

@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    private int userCount = 0;

    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
        //System.out.println("Session Created!");
        userCount++;
        arg0.getSession().getServletContext().setAttribute("userCount", userCount);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        //System.out.println("Session Destroyed!");
        userCount--;
        arg0.getSession().getServletContext().setAttribute("userCount", userCount);
        Map<String, User> userMap = (Map<String, User>) arg0.getSession().getServletContext().getAttribute("userMap");
        if (userMap != null) {
            userMap.remove(arg0.getSession().getId());
        }
    }

}
