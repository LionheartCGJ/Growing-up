package com.cgj.pattern.observer;

/**
 * 集体的目标对象，负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteSubject extends Subject {

    // 目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }

    // 在子类中具体实现notifyObservers()方法，实现根据不同的状态区别对待不同的观察者
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
