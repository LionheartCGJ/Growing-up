package com.cgj.spring.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.cgj.spring.transaction.dao.AccountDao;
import com.cgj.spring.transaction.service.AccountService;

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * 通过注解实现声明式事务管理
     */
    @Transactional
    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.outMoney(out, money);
    }

    /**
     * 编程式事务管理
     */
    public void transferByTransactionTemplate(String out, String in, Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.inMoney(in, money);
                accountDao.outMoney(out, money);
            }
        });
    }

    /**
     * 通过Proxy实现编程式事务管理
     */
    public void transferByProxy(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.outMoney(out, money);
    }

    /**
     * 通过AOP实现声明式事务管理
     */
    public void transferByAOP(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.outMoney(out, money);
    }
}
