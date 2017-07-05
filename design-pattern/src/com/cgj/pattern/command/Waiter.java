package com.cgj.pattern.command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 服务员类
 */
public class Waiter {

    // 存放具体命令的容器
    private List<Command> orders = new ArrayList<Command>();
    private SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

    // 设置订单
    public void setOrder(Command command) {
        if (command instanceof BakeChickenWingCommand) {
            System.out.println("服务员:对不起,鸡翅没有了,请您点别的!");
        } else if (command instanceof BakeMuttonCommand) {
            orders.add(command);
            System.out.println("增加订单:" + command.showCommand() + "时间:" + sdf.format(new Date()));
        }
    }

    // 取消订单
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单:" + command.showCommand() + "时间:" + sdf.format(new Date()));
    }

    // 通知全部执行
    public void notifyBarbecuer() {
        for (Command command : orders) {
            command.ExcuteCommand();
        }
    }
}
