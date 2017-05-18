package com.cgj.pattern.responsibility.chain;

/**
 * 经理可以处理20%以内的折扣
 */
public class Manager extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.20F) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }

}
