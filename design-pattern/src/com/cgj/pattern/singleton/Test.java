package com.cgj.pattern.singleton;

public class Test {

    public static void main(String[] args) {
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        if (lazy1 == lazy2) {
            System.out.println("lazy1 and lazy2 are the same instance!");
        } else {
            System.out.println("lazy1 and lazy2 are not the same instance!");
        }

        HungrySingleton hungry1 = HungrySingleton.getInstance();
        HungrySingleton hungry2 = HungrySingleton.getInstance();
        if (hungry1 == hungry2) {
            System.out.println("hungry1 and hungry2 are the same instance!");
        } else {
            System.out.println("hungry1 and hungry2 are not the same instance!");
        }
    }

}
