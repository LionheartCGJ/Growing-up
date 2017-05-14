package com.cgj.pattern.proxy;

public class CarTimeProxy implements Moveable {
    private Moveable move;

    public CarTimeProxy(Moveable move) {
        super();
        this.move = move;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使...");
        move.move();
        System.out.println("汽车行驶结束...");
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶时间：" + (endTime - startTime) + "毫秒");
    }
}
