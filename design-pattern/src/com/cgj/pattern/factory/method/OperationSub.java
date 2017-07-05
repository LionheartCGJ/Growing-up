package com.cgj.pattern.factory.method;

/**
 * 减法法运算类
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
