package com.cgj.spring.mvc.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent arg0) {
        System.out.println("HttpSessionAttributeListener_attributeAdded: " + arg0.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
        System.out.println("HttpSessionAttributeListener_attributeRemoved: " + arg0.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent arg0) {
        System.out.println("HttpSessionAttributeListener_attributeReplaced: " + arg0.getName());

    }

}
