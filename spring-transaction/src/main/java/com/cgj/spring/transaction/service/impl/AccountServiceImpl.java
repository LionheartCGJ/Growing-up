package com.cgj.spring.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cgj.spring.transaction.dao.AccountDao;
import com.cgj.spring.transaction.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Transactional
    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        accountDao.outMoney(out, money);
    }

}
