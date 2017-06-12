package com.cgj.pattern.state;

/**
 * 状态模式：当一个对象的内在状态改变时允许改变其行为，
 *     这个对象看起来像是改变了其行类
 * 状态模式的优点：将于特定状态行为局部化，
 *     并且将不同状态的行为分割开来
 * 何时使用状态模式：当一个对象的行为取决于它的状态，
 *     并且它必须在运行时刻根据状态改变它的行为时，
 *     就可以考虑使用状态模式
 */
public class Test {

    public static void main(String[] args) {
        // 设置context的初始状态为状态ConcreteStateA
        Context context = new Context(new ConcreteStateA());
        context.Request();
        context.Request();
        context.Request();
    }

}
