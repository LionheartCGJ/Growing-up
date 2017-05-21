package com.cgj.pattern.strategy;

public class FlyingWithWing implements FlyingStrategy {

    @Override
    public void performFly() {
        System.out.println("Fly with wings!");
    }

}
