package com.cgj.pattern.observer;

import java.util.Observable;
import java.util.Observer;

// 使用jdk自带的接口实现观察者模式中的观察者
// 观察者的具体实现
public class ConcreteWeatherObserver implements Observer {

    // 观察者的名称
    private String observerName;

    public ConcreteWeatherObserver(String observerName) {
        super();
        this.observerName = observerName;
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        // 第一种是推的方式
        System.out.println(observerName + " 收到了消息，目标推送过来的是：" + arg);
        // 第二种是拉的方式
        System.out.println(observerName + " 收到了消息，主动到目标对象中去拉，获取的内容是：" + ((ConcreteWeatherSubject) o).getContent());
    }

}
