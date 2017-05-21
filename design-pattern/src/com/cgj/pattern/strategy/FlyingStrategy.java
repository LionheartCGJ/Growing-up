package com.cgj.pattern.strategy;

/**
 * 飞行行为的抽象类
 * 将飞行行为抽象为接口，在鸭子类中持有该接口，并由该接口代理飞行行为。
 */
public interface FlyingStrategy {

    public void performFly();
}
