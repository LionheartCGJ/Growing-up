package com.cgj.pattern.memento;

public class Test {

    public static void main(String[] args) {

        // 创建Originator对象，并设置状态
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        // 对Originator进行备份
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.CreateMemento());

        // 设置新状态
        originator.setState("Off");
        originator.show();

        // 恢复备份
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }

}
