package com.cgj.pattern.compisite;

/**
 * Component:组合模式中的对象声明接口，在适当的情况下，
 *           实现所有类共有方法的默认行为，
 *           声明一个接口，用于访问和管理Component的子部件。
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        super();
        this.name = name;
    }

    // 通常用Add和Remove方法来提供增加或移除树叶或树枝的功能
    public abstract void Add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
