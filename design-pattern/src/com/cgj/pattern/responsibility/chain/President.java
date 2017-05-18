package com.cgj.pattern.responsibility.chain;

/**
 * 可以批准50%以内的折扣
 */
public class President extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.50F) {
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            System.out.println("你疯了吧，我们不会批准的！！！");
        }
    }

}
