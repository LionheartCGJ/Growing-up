package com.cgj.pattern.responsibility.chain;

/**
 * 客户类，会请求一些折扣
 */
public class Customer {

    // 直接面对客户的销售人员
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    // 客户请求折扣的方法
    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }
}
