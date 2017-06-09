package com.cgj.pattern.facade;

/**
 * 外观模式(Facade)：为子系统中的一组接口提供一个一致的界面，
 * 此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 */
public class Facade {

    /**
     * 外观类：知道哪些子系统负责处理请求，
     * 将客户的请求代理给适当的子系统对象
     * 
     * 子系统：分别实现对应的功能，处理外观类对象指派的任务
     * （注意：子类中没有外观类的任何信息，即没有外观类的引用）
     */
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        one.methodOne();
        two.methodTwo();
        three.methodThree();
    }

    public void methodB() {
        two.methodTwo();
        four.methodFour();
    }
}
