package com.cgj.pattern.proxy;

import java.util.Random;

public class Car implements Moveable {

    public void move() {
        // 实现开车
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
