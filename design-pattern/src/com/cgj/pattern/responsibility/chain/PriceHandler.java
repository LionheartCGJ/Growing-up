package com.cgj.pattern.responsibility.chain;

/**
 * 价格处理类，用于处理客户的折扣申请
 */
public abstract class PriceHandler {

    // 直接后继，用户传递请求
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣申请
     */
    public abstract void processDiscount(float discount);
}
