package com.shiyanlou.simulate.ioc;

public class ShiyanlouImpl implements Shiyanlou {
    @Override
    public String toUp(String s) {
        try {
            return s.toUpperCase();
        } catch (Exception ex) {
            return null;
        }
    }
}
