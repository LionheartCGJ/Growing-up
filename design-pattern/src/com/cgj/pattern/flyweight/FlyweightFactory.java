package com.cgj.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight是一个享元工厂,用来创建并管理Flyweight类对象.
 *      它主要用来确保合理的共享Flyweight,当用户请求一个Flyweight时,
 *      它创建一个Flyweight或者返回一个已经创建好的Flyweight.
 */
public class FlyweightFactory {

    // 保存Flyweight
    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    // 获取Flyweight
    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }

}
