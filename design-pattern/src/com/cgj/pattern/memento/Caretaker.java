package com.cgj.pattern.memento;

/**
 * Caretaker(管理者)：负责保存好备忘录Memento，
 *      同时它不能对备忘录的属性进行操作和检查。
 */
public class Caretaker {

    private Memento memento;

    // 得到备忘录
    public Memento getMemento() {
        return memento;
    }

    // 保存备忘录
    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
