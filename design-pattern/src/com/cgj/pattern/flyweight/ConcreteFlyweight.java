package com.cgj.pattern.flyweight;

/**
 * ConcreteFlyweight类实现Flyweight接口,并为内部状态增加存储空间.
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体的Flyweight:" + extrinsicstate);
    }

}
