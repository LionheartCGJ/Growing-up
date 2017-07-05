package com.cgj.pattern.iterator;

/**
 * Aggregate:聚集抽象类
 */
public interface Aggregate {

    // 创建迭代器
    public abstract Iterator CreateIterator();
}
