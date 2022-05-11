package com.zt1994.test;

import com.zt1994.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.lang.management.PlatformManagedObject;

/**
 * JdbcTemplateTest
 *
 * @author zhongtao
 * @date 2022/5/9 22:40
 */
public class TxTest {

    /**
     * jdbcTemplateAddTest
     */
    @Test
    public void txTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }


}
