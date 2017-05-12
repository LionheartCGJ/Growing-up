package com.cgj.pattern.proxy;

public class Test {

    public static void main(String[] args) {
        new ProxyByExtendsCar().move();
        new ProxyByPolymerizationCar().move();
    }

}
