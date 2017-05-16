package com.cgj.pattern.observer;

public class Test {

    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.setSubjectState("Hello Observer Pattern!");
        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());
        System.out.println(observer3.getObserverState());
    }

}
