package com.cgj.pattern.strategy;

/**
 * 鸭子的抽象类所有的鸭子都要继承此类
 * 抽象了鸭子的行为：展示和发出叫声
 */
public abstract class Duck {

    /**
     * 策略模式
     * 鸭子类通过聚合的方式，持有飞行抽象的引用，在鸭子的飞行方法中，调用抽象类的飞行方法
     * 通过传入不同的飞行抽象类的实现，实现不同种类的鸭子的不同飞行方式
     */
    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    /**
     * 发出叫声
     */
    public abstract void quack();

    /**
     * 显示鸭子的外观
     */
    public abstract void display();

    /**
     * 飞行方式，使用策略模式
     */
    public void fly() {
        flyingStrategy.performFly();
    }
}
