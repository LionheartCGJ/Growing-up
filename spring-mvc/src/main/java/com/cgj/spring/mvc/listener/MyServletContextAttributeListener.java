package com.cgj.spring.mvc.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent arg0) {
        System.out.println("ServletContextAttributeListener_attributeAdded: " + arg0.getName());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
        System.out.println("ServletContextAttributeListener_attributeRemoved: " + arg0.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        System.out.println("ServletContextAttributeListener_attributeReplaced: " + arg0.getName());
    }

}
