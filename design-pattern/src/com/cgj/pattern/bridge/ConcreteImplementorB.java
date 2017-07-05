package com.cgj.pattern.bridge;

/**
 * Implementor具体实现B
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现B!");

    }

}