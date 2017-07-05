package com.cgj.pattern.command;

/**
 * Blogs: http://www.cnblogs.com/LionheartCGJ/p/7062146.html
 */
public class Test {

    public static void main(String[] args) {
        // 开店前的准备
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonA = new BakeMuttonCommand(boy);
        Command bakeMuttonB = new BakeMuttonCommand(boy);
        Command bakeChicken = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        // 开门营业,顾客点菜
        girl.setOrder(bakeMuttonA);
        girl.setOrder(bakeChicken);
        girl.setOrder(bakeMuttonB);

        // 点菜完毕,通知厨房
        girl.notifyBarbecuer();
    }

}
