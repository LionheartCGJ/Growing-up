package com.cgj.pattern.bridge;

/**
 * Abstraction抽象类
 */
public abstract class Abstraction {

    // 将具体的实现方法,聚合到抽象类中
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    // 抽象的operatino方法,需要子类具体实现
    public abstract void operation();
}
