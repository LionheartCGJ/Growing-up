package com.cgj.pattern.state;

/**
 * 状态类接口，定义一个接口以封装与Context的一个特定状态相关的行为
 */
public interface State {
    public abstract String getState();

    public abstract void Handle(Context context);
}
