package com.cgj.spring.mvc.entity;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class User implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable {

    private static final long serialVersionUID = 1L;

    private String sessionId;

    private String username;

    private String password;

    private String ip;

    private String fristTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFristTime() {
        return fristTime;
    }

    public void setFristTime(String fristTime) {
        this.fristTime = fristTime;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent arg0) {
        System.out.println("valueBound Name: " + arg0.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent arg0) {
        System.out.println("valueUnbound Name: " + arg0.getName());
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent arg0) {
        System.out.println("sessionDidActivate Name: " + arg0.getClass());
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent arg0) {
        System.out.println("sessionWillPassivate Name: " + arg0.getClass());
    }

}
