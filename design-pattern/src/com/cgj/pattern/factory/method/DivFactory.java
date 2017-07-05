package com.cgj.pattern.factory.method;

/**
 * 除法类工厂
 */
public class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
