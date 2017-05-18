package com.cgj.pattern.responsibility.chain;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createHandler());
        customer.requestDiscount(0.03F);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            customer.requestDiscount(random.nextFloat());
        }
    }

}
