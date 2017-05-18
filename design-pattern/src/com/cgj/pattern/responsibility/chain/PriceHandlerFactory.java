package com.cgj.pattern.responsibility.chain;

/**
 * 责任链工厂类
 */
public class PriceHandlerFactory {

    /**
     * 责任链创建工厂方法
     */
    public static PriceHandler createHandler() {
        PriceHandler sales = new Sales();
        PriceHandler director = new Director();
        PriceHandler manager = new Manager();
        PriceHandler president = new President();
        sales.setSuccessor(president);
        director.setSuccessor(manager);
        manager.setSuccessor(president);
        return sales;
    }

}
