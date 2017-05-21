package com.cgj.pattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        // 绿脖鸭用翅膀飞行
        super.setFlyingStrategy(new FlyingWithWing());
    }

    @Override
    public void quack() {
        System.out.println("ga..gaga...ga..gaga......");
    }

    @Override
    public void display() {
        System.out.println("My neck is green!");

    }

}
