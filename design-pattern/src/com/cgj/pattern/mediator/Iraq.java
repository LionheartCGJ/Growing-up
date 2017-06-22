package com.cgj.pattern.mediator;

/**
 * 美国类,相当于具体的Colleague类
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    // 具体发送消息的方法
    public void declare(String message) {
        mediator.Declare(message, this);
    }

    // 具体的到消息的方法
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息:" + message);
    }
}
