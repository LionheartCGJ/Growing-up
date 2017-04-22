package com.bes.spring.transaction.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cgj.spring.transaction.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class AccountServiceTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AccountService accountService;

    @Resource(name="accountServiceProxy")
    AccountService accountServiceProxy;
    @Test
    public void testTransfer() throws Exception {
        String in = "aaa";
        String out = "bbb";
        Double money = 300D;
        accountService.transfer(out, in, money);
        logger.info("从账户{}转入到账户{}{}元！！！", out, in, money);
    }

    @Test
    public void testTransferByTransactionTemplate() throws Exception {
        String in = "bbb";
        String out = "aaa";
        Double money = 300D;
        accountService.transferByTransactionTemplate(out, in, money);
        logger.info("从账户{}转入到账户{}{}元！！！", out, in, money);
    }
    
    @Test
    public void testTransferByProxy() throws Exception {
        String in = "bbb";
        String out = "aaa";
        Double money = 300D;
        accountServiceProxy.transferByProxy(out, in, money);
        logger.info("从账户{}转入到账户{} {}元！！！", out, in, money);
    }

    @Test
    public void testTransferByAOP() throws Exception {
        String in = "aaa";
        String out = "bbb";
        Double money = 300D;
        accountService.transferByAOP(out, in, money);
        logger.info("从账户{}转入到账户{}{}元！！！", out, in, money);
    }
}
