package com.cgj.spring.transaction.dao;

public interface AccountDao {
    public int inMoney(String in, Double money);

    public int outMoney(String out, Double money);
}
