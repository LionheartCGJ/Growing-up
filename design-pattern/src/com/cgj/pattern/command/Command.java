package com.cgj.pattern.command;

/**
 * 抽象命令类
 */
public abstract class Command {

    // 抽象命令类,只需要知道烤肉串的是谁
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        super();
        this.receiver = receiver;
    }

    // 显示命令
    public abstract String showCommand();

    // 执行命令
    public abstract void ExcuteCommand();
}
