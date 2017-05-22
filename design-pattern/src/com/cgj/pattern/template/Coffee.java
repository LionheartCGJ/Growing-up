package com.cgj.pattern.template;

/**
 * 具体子类，提供了制备咖啡的具体实现
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶...");
    }

}
