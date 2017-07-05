package com.cgj.pattern.state;

/**
 * 具体状态，每一个子类实现一个与Context的状态相关的行为
 */
public class ConcreteStateB implements State {

    public String getState() {
        return "State B";
    }

    /**
     * 设置ConcreteStateA的下一状态是ConcreteStateB
     */
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }

}
