package com.cgj.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        // 测试jdk动态代理

        Car car = new Car();
        Moveable move = (Moveable) Proxy.newProxyInstance(Car.class.getClassLoader(), Car.class.getInterfaces(),
                (InvocationHandler) new TimeHandle(car));
        Moveable move2 = (Moveable) MyProxy.newProxyInstance(Moveable.class, new MyTimeHandler(car));
        move.move();
        move2.move();
    }
}