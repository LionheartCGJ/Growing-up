package com.cgj.pattern.visitor;

/**
 * Visitor接口
 */
public interface Action {

    // 得到男人结论或反应
    public abstract void getManConclusion(Man concreteElement);
    
    // 得到女人的结论或反应
    public abstract void getWomanConclusion(Woman concreteElement);
}
