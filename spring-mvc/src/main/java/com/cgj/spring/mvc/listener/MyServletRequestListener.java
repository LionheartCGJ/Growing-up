package com.cgj.spring.mvc.listener;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

import com.cgj.spring.mvc.entity.User;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {

    private Map<String, User> userMap;// 在线用户Map

    @SuppressWarnings("unchecked")
    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
        System.out.println("Request Initialized!");
        userMap = (Map<String, User>) arg0.getServletContext().getAttribute("userMap");
        if (userMap == null) {
            userMap = new HashMap<String, User>();
        }
        HttpServletRequest request = (HttpServletRequest) arg0.getServletRequest();
        String sessionId = request.getSession().getId();
        if (userMap.get(sessionId) == null) {
            User user = new User();
            user.setSessionId(sessionId);
            user.setIp(request.getRemoteAddr());
            user.setFristTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            userMap.put(sessionId, user);
        }
        arg0.getServletContext().setAttribute("userMap", userMap);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println("Request Destroyed!");
    }

}
