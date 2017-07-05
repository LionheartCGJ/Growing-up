package com.cgj.pattern.bridge;

/**
 * abstraction的精炼子类
 */
public class RefinedAbstraction extends Abstraction {

    // 具体实现operation方法
    @Override
    public void operation() {
        implementor.operation();

    }

}
