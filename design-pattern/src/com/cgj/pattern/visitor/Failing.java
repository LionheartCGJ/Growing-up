package com.cgj.pattern.visitor;

/**
 * 具体的访问者,实现每个由Visitor声明的操作.
 * 每个操作实现算法的一部分,而该算法片段乃是对应于结构中对象的类.
 */
public class Failing implements Action {

    @Override
    public void getManConclusion(Man concreteElement) {
        System.out.println("男人失败时,闷头喝酒谁也不用劝.");

    }

    @Override
    public void getWomanConclusion(Woman concreteElement) {
        System.out.println("女人失败时,眼泪汪汪,谁也劝不了.");

    }

}