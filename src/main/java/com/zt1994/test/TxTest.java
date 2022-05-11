package com.zt1994.test;

import com.zt1994.config.TxConfig;
import com.zt1994.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.lang.management.PlatformManagedObject;

/**
 * TxTest
 *
 * @author zhongtao
 * @date 2022/5/9 22:40
 */
public class TxTest {

    /**
     * txTest
     */
    @Test
    public void txTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }


    /**
     * txXMLTest
     */
    @Test
    public void txXMLTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationTXXml.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

    /**
     * txAnnoTest
     */
    @Test
    public void txAnnoTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

}
