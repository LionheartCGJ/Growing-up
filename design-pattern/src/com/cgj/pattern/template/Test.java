package com.cgj.pattern.template;

public class Test {

    public static void main(String[] args) {
        System.out.println("测试开始");
        System.out.println("******************************************");
        System.out.println("给我来一杯咖啡可好？");
        RefreshBeverage coffee = new Coffee();
        coffee.prepareBeverageTemplate();
        System.out.println("咖啡泡好了，请慢用...");
        System.out.println();
        System.out.println("给我来一杯茶可好？");
        RefreshBeverage tea = new Tea();
        tea.prepareBeverageTemplate();
        System.out.println("茶泡好了，请慢用...");
        System.out.println("******************************************");
        System.out.println("测试结束");
    }
}
