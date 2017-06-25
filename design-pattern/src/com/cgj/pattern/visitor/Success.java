package com.cgj.pattern.visitor;

/**
 * 具体的访问者,实现每个由Visitor声明的操作.
 * 每个操作实现算法的一部分,而该算法片段乃是对应于结构中对象的类.
 */
public class Success implements Action {

    @Override
    public void getManConclusion(Man concreteElement) {
        System.out.println("男人成功时,背后多半有一个伟大的女人.");

    }

    @Override
    public void getWomanConclusion(Woman concreteElement) {
        System.out.println("女人成功时,背后大多有一个不成功的男人.");

    }

}
