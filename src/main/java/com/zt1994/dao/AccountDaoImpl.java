package com.zt1994.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * AccountDaoImpl
 *
 * @author zhongtao
 * @date 2022/5/10 22:26
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * addMoney
     */
    @Override
    public void addMoney() {
        String sql = "UPDATE t_account SET money = money + ? WHERE username = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }

    /**
     * reduceMoney
     */
    @Override
    public void reduceMoney() {
        String sql = "UPDATE t_account SET money = money - ? WHERE username = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }
}
