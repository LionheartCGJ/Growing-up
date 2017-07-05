package com.cgj.pattern.state;

/**
 * 具体状态，每一个子类实现一个与Context的状态相关的行为
 */
public class ConcreteStateA implements State {

    public String getState() {
        return "State A";
    }

    /**
     * 设置ConcreteStateB的下一状态是ConcreteStateA
     */
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }

}
