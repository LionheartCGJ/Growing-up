package com.cgj.spring.transaction.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class AccountDaoTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AccountDao accountDao;

    @Test
    public void testInmoney() throws Exception {
        String name = "aaa";
        Double money = 200D;
        accountDao.inMoney(name, money);
        logger.info("{}账户转入{}元！！！", name, money);
    }

    @Test
    public void testOutMoney() throws Exception {
        String name = "aaa";
        Double money = 200D;
        accountDao.outMoney(name, money);
        logger.info("{}账户转出{}元！！", name, money);
    }
}
