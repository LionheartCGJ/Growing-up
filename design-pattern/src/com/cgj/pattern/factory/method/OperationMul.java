package com.cgj.pattern.factory.method;

/**
 * 乘法运算类
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
