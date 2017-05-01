package com.cgj.spring.mvc.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("Session Created!");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("Session Destroyed!");
    }

}
