package com.cgj.pattern.strategy;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super();
        // 红头鸭用翅膀飞行
        super.setFlyingStrategy(new FlyingWithWing());
    }

    @Override
    public void quack() {
        System.out.println("ga..gaga...ga..gaga......");
    }

    @Override
    public void display() {
        System.out.println("My head is red!");
    }

}
