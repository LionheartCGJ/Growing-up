package com.cgj.pattern.strategy;

public class Test {

    public static void main(String[] args) {
        System.out.println("测试鸭子程序");
        System.out.println("**************************************************");
        System.out.println("绿脖鸭");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println("红头鸭");
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.fly();
        System.out.println("橡胶鸭");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
        System.out.println("大黄鸭");
        BigYellowDuck bigYellowDuck = new BigYellowDuck();
        bigYellowDuck.display();
        bigYellowDuck.quack();
        bigYellowDuck.fly();
        System.out.println("**************************************************");
        System.out.println("测试结束");
    }

}
