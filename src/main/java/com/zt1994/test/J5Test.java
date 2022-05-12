package com.zt1994.test;


import com.zt1994.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * JUnit5 整合
 * ExtendWith 指定单元测试版本
 * ContextConfiguration 加载配置文件
 * SpringJUnitConfig 复合注解
 *
 * @author zhongtao
 * @date 2022/5/12 22:38
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:applicationTXXml.xml")
@SpringJUnitConfig(locations = "classpath:applicationTXXml.xml")
public class J5Test {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1() {
        accountService.accountMoney();
    }
}
