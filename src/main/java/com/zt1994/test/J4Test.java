package com.zt1994.test;

import com.zt1994.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JUnit4 整合
 * RunWith 指定单元测试版本
 * ContextConfiguration 加载配置文件
 *
 * @author zhongtao
 * @date 2022/5/12 22:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationTXXml.xml")
public class J4Test {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1() {
        accountService.accountMoney();
    }
}
