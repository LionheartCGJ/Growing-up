package com.cgj.pattern.mediator;

/**
 * 美国类,相当于具体的Colleague类
 */
public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    // 具体发送消息的方法
    public void declare(String message) {
        mediator.Declare(message, this);
    }

    // 具体的到消息的方法
    public void getMessage(String message) {
        System.out.println("美国获得对方消息:" + message);
    }
}
