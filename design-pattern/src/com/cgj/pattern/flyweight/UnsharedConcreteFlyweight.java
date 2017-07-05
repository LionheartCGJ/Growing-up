package com.cgj.pattern.flyweight;

/**
 * UnsharedConcreteFlyweight指不需要共享的Flyweight实现类.
 *      因为实现了Flyweight接口共享成为可能,但并不强制共享.
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight:" + extrinsicstate);
    }

}
