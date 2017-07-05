package com.cgj.pattern.decorator;

/**
 * 装饰类的抽象父类
 * 需要继承被装饰的类，以便多次进行装饰
 */
public abstract class Finery implements Person{

    /**
     * 把被装饰类聚合到装饰类中
     */
    protected Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    /**
     * 具体装饰的方法，在该方法中调用Person的show方法
     */
    public abstract void show();
}
