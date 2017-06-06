package com.cgj.pattern.decorator;

public class Test {

    public static void main(String[] args) {
        Boy boy = new Boy();
        Girl girl = new Girl();
        FineryShirt shirt = new FineryShirt();
        FinerySkirt skirt = new FinerySkirt();
        FineryTrouser trouser = new FineryTrouser();
        
        shirt.decorate(boy);
        trouser.decorate(shirt);
        trouser.show();
        
        shirt.decorate(girl);
        skirt.decorate(shirt);
        skirt.show();
    }

}
