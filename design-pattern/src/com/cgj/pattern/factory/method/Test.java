package com.cgj.pattern.factory.method;

/**
 * Blogs: http://www.cnblogs.com/LionheartCGJ/p/7087576.html
 */
public class Test {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();

        operation.setNumberA(67.2D);
        operation.setNumberB(35.4D);

        System.out.println(operation.getResult());
    }
}
