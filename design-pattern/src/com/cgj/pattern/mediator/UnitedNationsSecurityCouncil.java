package com.cgj.pattern.mediator;

/**
 * 具体的中介者类,控制交互的行为
 */
public class UnitedNationsSecurityCouncil implements UnitedNations {

    // 中介者需要知道所有的colleague
    private USA usa;
    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    // 具体的通知方法
    @Override
    public void Declare(String message, Country colleague) {
        if (usa == colleague) {
            iraq.getMessage(message);
        } else if (iraq == colleague) {
            usa.getMessage(message);
        }
    }

}
