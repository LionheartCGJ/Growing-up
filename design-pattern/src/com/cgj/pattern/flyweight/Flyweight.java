package com.cgj.pattern.flyweight;

/**
 * Flyweight接口:是多有享元类的超类或接口,通过这个接口,
 *      Flyweight可以接受并作用于外部状态.
 */
public interface Flyweight {

    public abstract void operation(int extrinsicstate);
}
