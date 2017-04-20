package com.cgj.spring.transaction.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cgj.spring.transaction.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public int inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        return this.getJdbcTemplate().update(sql, money, in);
    }

    @Override
    public int outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        return this.getJdbcTemplate().update(sql, money, out);
    }

}
