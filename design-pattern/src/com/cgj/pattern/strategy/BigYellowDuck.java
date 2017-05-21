package com.cgj.pattern.strategy;

public class BigYellowDuck extends Duck {

    public BigYellowDuck() {
        super();
        super.setFlyingStrategy(new FlyingNoWay());
    }

    @Override
    public void quack() {
        System.out.println("I can't quack!");

    }

    @Override
    public void display() {
        System.out.println("I'm huge and my body yellow!");

    }

}
