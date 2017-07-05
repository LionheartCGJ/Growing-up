package com.cgj.pattern.command;

/**
 * 具体的烤羊肉串的命令类
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    // 执行命令时,执行具体的方法
    @Override
    public void ExcuteCommand() {
        receiver.BakeMutton();
    }

    @Override
    public String showCommand() {
        return "烤羊肉串";
    }

}
