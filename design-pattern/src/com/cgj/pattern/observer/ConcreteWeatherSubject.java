package com.cgj.pattern.observer;

import java.util.Observable;

// 使用jdk自带的类实现观察者模式的目标类
// 天气目标的具体实现类
public class ConcreteWeatherSubject extends Observable {

    // 天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // 天气情况更新后通知所有的观察者
        // 注意： 使用jdk中的Observer模式的时候，通知观察者之前必须先调用setChanged()方法
        this.setChanged();
        // 使用推模型，直接将天气信息推送给所有观察者
        // (Observer.update(Observable o, Object arg)依然可以获取到目标对象的引用)
        this.notifyObservers(content);
        // 使用拉模型，将目标类具体实现的对象的引用传递给所有观察者，由观察者主动获取所需要的信息
        // (Observer.update(Observable o, Object arg)中arg参数为null)
        //this.notifyObservers();
    }
    
}
