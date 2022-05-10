package com.zt1994.service;

import com.zt1994.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AccountService
 *
 * @author zhongtao
 * @date 2022/5/10 22:26
 */
@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 转账方法
     */
    public void accountMoney() {
        accountDao.reduceMoney();
        accountDao.addMoney();
    }

}
