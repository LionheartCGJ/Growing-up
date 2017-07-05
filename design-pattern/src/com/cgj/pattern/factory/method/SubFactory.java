package com.cgj.pattern.factory.method;

/**
 * 减法类工厂
 */
public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
