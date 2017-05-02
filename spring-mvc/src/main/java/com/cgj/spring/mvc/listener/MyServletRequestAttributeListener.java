package com.cgj.spring.mvc.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent arg0) {
        System.out.println("ServletRequestAttributeListener_attributeAdded: " + arg0.getName());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
        System.out.println("ServletRequestAttributeListener_attributeRemoved: " + arg0.getName());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
        System.out.println("ServletRequestAttributeListener_attributeReplaced: " + arg0.getName());
    }

}
