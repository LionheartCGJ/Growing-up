package com.cgj.pattern.interpreter;

/**
 * 声明一个抽象的解释操作,这个接口为抽象语法树中所有节点所共享.
 */
public interface AbstractExpression {

    public abstract void interpret(Context context);
}
