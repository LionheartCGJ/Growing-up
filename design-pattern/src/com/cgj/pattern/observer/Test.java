package com.cgj.pattern.observer;

public class Test {

    /**
     * 观察者模式的优缺点
     *  优点：
     *      1.观察者模式实现了观察者和目标之间的抽象耦合
     *      2.观察者模式实现了动态联动
     *      3.观察者模式支持广播通信
     *  缺点：可能引起无谓的操作
     */
    /**
     * 建议在以下情况中选择用观察者模式：
     *    1.当一个抽象模型有两个方面，其中一个方面的操作依赖与另一个方面的状态变化
     *    2.如果在更改一个对象的时候，需要连带改变其他的对象，而且不知道究竟应该有多少对象需要被连带改变
     *    3.当一个对象状态改变的时候必选通知其他对象，但是你又希望这个对象和其他被通知的对象是松散耦合的
     */
    public static void main(String[] args) {
        // 手动编写简单通用的观察者模式实现测试
       /* ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);
        subject.setSubjectState("Hello Observer Pattern!");
        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());
        System.out.println(observer3.getObserverState());*/
        // jdk 观察者模式测试
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        ConcreteWeatherObserver observer3 = new ConcreteWeatherObserver("John");
        ConcreteWeatherObserver observer1 = new ConcreteWeatherObserver("Tom");
        ConcreteWeatherObserver observer2 = new ConcreteWeatherObserver("Bob");
        // 重复添加同一对象，只保留一个
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.setContent("This is sun day!");
        
    }

}
