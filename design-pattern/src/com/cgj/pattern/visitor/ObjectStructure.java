package com.cgj.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 能枚举它的元素,可以提供一个高层的接口以允许访问者访问他的元素.
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<Person>();

    public boolean add(Person element) {
        return elements.add(element);
    }

    public boolean detach(Person element) {
        return elements.remove(element);
    }

    // 枚举所有元素
    public void display(Action visitor) {
        for (Person element : elements) {
            element.accept(visitor);
        }
    }
}
