package com.cgj.pattern.proxy;

/**
 * 通过继承的方式实现静态代理
 */
public class ProxyByExtendsCar extends Car {
    public void move(){
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使...");
        super.move();
        System.out.println("汽车行驶结束...");
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶时间：" + (endTime - startTime) + "毫秒");
    }
}
