package com.cgj.pattern.adapter;

/**
 * 通过聚合的方式实现对象适配器
 *  把需要适配的对象作为一个属性聚合到适配器类中，以修改目标接口包装被适配者
 */
public class TwoPhaseToThreePhaseAdapterByPolymerization implements ThreePhaseSocket {

    // 将需要适配的类组合到适配器中
    private GBTwoPhaseSocket twoPhaseSocket;

    public TwoPhaseToThreePhaseAdapterByPolymerization(GBTwoPhaseSocket twoPhaseSocket) {
        super();
        this.twoPhaseSocket = twoPhaseSocket;
    }

    // 转换过程
    @Override
    public void powerWithThree() {
        twoPhaseSocket.powerWithTwo();
        System.out.println("将二相电流转换为三相电流...");
    }
}
