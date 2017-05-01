package com.cgj.spring.mvc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("Context Initialized!");
        String author = arg0.getServletContext().getInitParameter("author");
        System.out.println("Author: " + author);
    }

    
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("CSontext Destroyed!");
    }
}
