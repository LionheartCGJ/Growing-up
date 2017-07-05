package com.cgj.pattern.factory.method;

/**
 * 乘法类工厂
 */
public class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
