package com.cgj.pattern.proxy;

import java.lang.reflect.Method;

public interface MyInvocationHandler {

    public Object invoke(Object proxy, Method method) throws Throwable;
}
