package com.cgj.pattern.factory;

/**
 * 模拟客户端实现
 * 抽象工厂模式就是在工厂模式的基础上再进行一次封装，用工厂的抽象类产生不同的工厂
 */
public class Test {

    public static void main(String[] args) {
        HairFactory.getHair("left").draw();
    }

}
