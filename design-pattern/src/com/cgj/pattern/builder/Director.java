package com.cgj.pattern.builder;

/**
 * 指挥者类，用来指挥建造过程
 */
public class Director {
    public void construct(Builder builder) {
        builder.builderPartA();
        builder.builderPartB();
    }
}
