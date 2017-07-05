package com.cgj.pattern.decorator;

/**
 * 具体装饰的类
 */
public class FinerySkirt extends Finery {

    @Override
    public void show() {
        System.out.print("Skirt ");
        if(person != null) {
            person.show();
        }
    }

}
