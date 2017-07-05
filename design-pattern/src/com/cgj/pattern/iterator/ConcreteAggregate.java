package com.cgj.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcregateAggregate:具体的聚集类,实现Aggregate接口
 */
public class ConcreteAggregate implements Aggregate {

    // 声明一个List泛型变量,用于存放聚合对象
    private List<Object> items = new ArrayList<Object>();

    // 向集合加入元素
    public void put(Object item) {
        items.add(item);
    }

    // 从集合获取元素
    public Object get(int index) {
        return items.get(index);
    }

    // 获取集合元素数量
    public int count() {
        return items.size();
    }

    // 创建迭代器
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

}
