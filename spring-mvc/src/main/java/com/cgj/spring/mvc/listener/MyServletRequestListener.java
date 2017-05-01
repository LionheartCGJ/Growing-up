package com.cgj.spring.mvc.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
        System.out.println("Request Initialized!");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println("Request Destroyed!");
    }

}
