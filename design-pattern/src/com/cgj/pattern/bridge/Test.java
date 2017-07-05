package com.cgj.pattern.bridge;

/**
 * 桥接模式(Bridge):将抽象与它的实现部分分离,使它们都可以独立变化.
 *  (ps:什么叫抽象和实现分离,这并不是说,让抽象类与其派生类分离,
 *      因为这没有任何意义.实现指的是抽象类和它的派生类用来实现自己的对象.)
 * 
 * 合成/聚合复用原则:尽量使用合成/聚合,尽量不使用类继承.
 *  (ps:优先使用对象的合成聚合将有助你保持每个类被封装,并被集中在单个任务上.
 *      这样类和类继承层次会保持较小规模,并且不太可能增长为不可控制的庞然大物.)
 */
public class Test {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();

    }
}
