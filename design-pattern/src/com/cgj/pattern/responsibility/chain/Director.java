package com.cgj.pattern.responsibility.chain;

/**
 * 主任可以处理10%以内的请求
 */
public class Director extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.10F) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }

}
