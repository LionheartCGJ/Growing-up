package com.cgj.pattern.decorator;

/**
 * 具体装饰的类
 */
public class FineryTrouser extends Finery {

    @Override
    public void show() {
        System.out.print("Trouser  ");
        if(person != null) {
            person.show();
        }
    }

}
