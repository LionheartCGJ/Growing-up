package com.cgj.pattern.strategy;

public class FlyingNoWay implements FlyingStrategy{

    @Override
    public void performFly() {
        System.out.println("I can swim but I can't fly!");
    }

}
