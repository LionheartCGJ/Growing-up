package com.cgj.pattern.decorator;

/**
 * 具体装饰的类
 */
public class FineryShirt extends Finery {

    @Override
    public void show() {
        System.out.print(" Shirt ");
        if (person != null) {
            person.show();
        }
    }
}
