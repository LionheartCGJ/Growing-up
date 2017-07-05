package com.cgj.pattern.decorator;

/**
 * 被装饰类的具体类
 */
public class Girl implements Person {

    @Override
    public void show() {
        System.out.println("I'm a girl!");
    }

}
