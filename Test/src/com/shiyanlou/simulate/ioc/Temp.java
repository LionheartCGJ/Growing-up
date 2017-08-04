package com.shiyanlou.simulate.ioc;

public class Temp {

    private Shiyanlou shiyanlou;

    public Shiyanlou getShiyanlou() {
        return shiyanlou;
    }

    public void setShiyanlou(Shiyanlou shiyanlou) {
        this.shiyanlou = shiyanlou;
    }

    public String toUp(String name) {
        return shiyanlou.toUp(name);
    }
}
