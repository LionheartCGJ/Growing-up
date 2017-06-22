package com.cgj.pattern.mediator;

/**
 * 国家类,相当于Colleague类
 */
public abstract class Country {

    // 每个国家类都需要知道中介者
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        super();
        this.mediator = mediator;
    }

}
