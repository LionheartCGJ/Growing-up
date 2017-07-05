package com.cgj.pattern.visitor;

/**
 * 具体的访问者,实现每个由Visitor声明的操作.
 * 每个操作实现算法的一部分,而该算法片段乃是对应于结构中对象的类.
 */
public class Amativeness implements Action {

    @Override
    public void getManConclusion(Man concreteElement) {
        System.out.println("男人恋爱时,凡是不懂也要装懂.");

    }

    @Override
    public void getWomanConclusion(Woman concreteElement) {
        System.out.println("女人恋爱时,遇事懂也装作不懂.");

    }

}