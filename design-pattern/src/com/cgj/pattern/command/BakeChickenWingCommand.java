package com.cgj.pattern.command;

/**
 * 具体的烤鸡翅的命令类
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    // 执行命令时,执行具体的方法
    @Override
    public void ExcuteCommand() {
        receiver.BakeChickenWing();
    }

    @Override
    public String showCommand() {
        return "烤鸡翅";
    }

}
