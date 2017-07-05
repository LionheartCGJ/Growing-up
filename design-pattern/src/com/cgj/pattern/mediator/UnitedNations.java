package com.cgj.pattern.mediator;

/**
 * 联合国机构类,相当于Mediator类
 */
public interface UnitedNations {

    // 声明一个发送消息的接口
    public abstract void Declare(String message, Country colleague);
}
