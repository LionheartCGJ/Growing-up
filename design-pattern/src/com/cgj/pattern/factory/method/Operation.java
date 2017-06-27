package com.cgj.pattern.factory.method;

/**
 * 运算类的父类,定义公共的方法
 */
public abstract class Operation {

    protected double numberA;
    protected double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    // 取得结果
    public abstract double getResult();
}
