package com.cgj.pattern.bridge;

/**
 * Implementor具体实现A
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A!");

    }

}
