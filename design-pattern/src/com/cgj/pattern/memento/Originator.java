package com.cgj.pattern.memento;

/**
 * Originator(发起人)：负责创建一个备忘录Memento，
 *     用以记录当前时刻它的内部状态，
 *     比更可以使用和备忘录恢复他的内部状态。
 *     可根据需要决定Memento存储Originator的哪些状态。
 */
public class Originator {
    // 需要保存的属性，可能有多个
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void show() {
        System.out.println("State=" + state);
    }

    // 创建备忘录，将当前需要保存的数据导入Memento对象
    public Memento CreateMemento() {
        return new Memento(state);
    }

    // 恢复属性，将Memento导入并将相关数据恢复
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }
}
