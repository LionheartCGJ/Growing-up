package com.cgj.pattern.adapter;

/**
 * 通过集成的方式实现类适配器
 *  通过继承需要被适配的类，实现对目标接口的匹配，单一的为某个类实现适配
 */
public class TwoPhaseToThreePhaseAdapterByExtends extends GBTwoPhaseSocket implements ThreePhaseSocket {

    // 转换过程
    @Override
    public void powerWithThree() {
        powerWithTwo();
        System.out.println("将二相电流转换为三相电流...");
    }

}
