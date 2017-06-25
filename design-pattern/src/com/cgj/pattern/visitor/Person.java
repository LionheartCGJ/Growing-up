package com.cgj.pattern.visitor;

/**
 * Element接口:定义一个访问的方法,它以一个访问者为参数
 */
public interface Person {

    // 他是用来获得Visitor对象的
    public abstract void accept(Action visitor);
}
