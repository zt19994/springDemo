package com.zt1994.service;

import com.zt1994.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * AccountService
 *
 * @author zhongtao
 * @date 2022/5/10 22:26
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 转账方法
     * 编程式方式
     */
    public void accountMoneyFunc() {
        try {
            // 第一步 开启事务

            // 第二步 进行业务操作

            accountDao.reduceMoney();

            // 模拟异常
            int i = 10 / 0;

            accountDao.addMoney();

            // 第三步 没有发生异常，提交事务
        } catch (Exception e) {
            // 第四步 出现异常，事务回滚
        }
    }

    /**
     * 转账方法
     * 注解方式
     */
    public void accountMoney() {

        // 第一步 开启事务

        // 第二步 进行业务操作

        accountDao.reduceMoney();

        // 模拟异常
        int i = 10 / 0;

        accountDao.addMoney();

        // 第三步 没有发生异常，提交事务

    }

}
