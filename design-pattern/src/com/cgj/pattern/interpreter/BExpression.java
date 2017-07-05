package com.cgj.pattern.interpreter;

public class BExpression implements AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("解释器B");
    }

}
