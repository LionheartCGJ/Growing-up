package com.cgj.pattern.factory.method;

/**
 * 加法类工厂
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
