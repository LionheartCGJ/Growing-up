package com.cgj.pattern.observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {

    // 观察者的状态
    private String observerState;

    public String getObserverState() {
        return observerState;
    }

    // 获取目标的状态，同步更新观察者的状态
    @Override
    public void update(Subject subject) {
        this.observerState = ((ConcreteSubject) subject).getSubjectState();
    }

}
