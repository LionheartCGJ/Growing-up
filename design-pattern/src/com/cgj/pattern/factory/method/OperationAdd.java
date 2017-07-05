package com.cgj.pattern.factory.method;

/**
 * 加法运算类
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
