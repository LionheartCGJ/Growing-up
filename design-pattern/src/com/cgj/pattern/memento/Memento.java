package com.cgj.pattern.memento;

/**
 * Memento(备忘录)：负责存储Originate对象的内部状态，
 *      并可以防止Originate以外的其他对象访问备忘录。
 * 窄接口：Caretaker只能看备忘录的窄接口，
 *      它只能将备忘录传递给其他对象。
 * 宽接口：Originator能看到一个宽接口，
 * 允许它访问需要恢复的所有属性。
 */
public class Memento {

    // 需要保存的数据属性，可以是多个
    private String state;

    // 构造方法，将相关数据导入
    public Memento(String state) {
        this.state = state;
    }

    // 得到保存的数据
    public String getState() {
        return state;
    }
}
