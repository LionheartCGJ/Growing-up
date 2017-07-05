package com.cgj.pattern.state;

/**
 * Context类负责处理请求
 */
public class Context {

    /**
     * 维护一个State子类的实例，这个实例定义当前的状态
     */
    private State state;

    /**
     * 定义Context的初始状态
     */
    public Context(State state) {
        super();
        this.state = state;
    }

    /**
     * 用于更新当前状态
     */
    public void setState(State state) {
        this.state = state;
        System.out.println(state.getState());
    }

    /**
     * 对请求做处理，并设置下一状态
     */
    public void Request() {
        state.Handle(this);
    }
}
