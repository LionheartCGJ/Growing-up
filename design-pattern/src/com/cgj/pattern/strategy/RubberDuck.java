package com.cgj.pattern.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStrategy(new FlyingNoWay());
    }
    @Override
    public void quack() {
        System.out.println("I can't quack!");

    }

    @Override
    public void display() {
        System.out.println("My body is yellow and my mouth is red!");

    }

}
