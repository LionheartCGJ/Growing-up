package com.cgj.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 */
public abstract class Subject {

    // 用来保存注册的观察者对象
    List<Observer> observers = new ArrayList<Observer>();

    // 将观察者对象添加到集合中
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 从集合中删除观察者对象
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 定义抽象的notifyObservers()方法，在子类中去具体实现可实现区别对待观察者
    protected abstract void notifyObservers();

    /*public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }*/
}
