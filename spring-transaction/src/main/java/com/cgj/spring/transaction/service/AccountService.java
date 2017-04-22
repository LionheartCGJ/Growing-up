package com.cgj.spring.transaction.service;

public interface AccountService {
    public void transfer(String out, String in, Double money);

    public void transferByTransactionTemplate(String out, String in, Double money);

    public void transferByProxy(String out, String in, Double money);

    public void transferByAOP(String out, String in, Double money);
}
