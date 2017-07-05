package com.cgj.pattern.visitor;

/**
 * 具体的Element类
 */
public class Man implements Person {

    // visitor给出访问的结果
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

}
