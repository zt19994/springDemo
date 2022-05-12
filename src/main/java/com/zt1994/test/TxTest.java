package com.zt1994.test;

import com.zt1994.config.TxConfig;
import com.zt1994.entity.Book;
import com.zt1994.service.AccountService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * TxTest
 *
 * @author zhongtao
 * @date 2022/5/9 22:40
 */
public class TxTest {

    private static final Logger logger = LoggerFactory.getLogger(TxTest.class);

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
        logger.info("txAnnoTest accountService:{}", accountService);
        accountService.accountMoney();
    }


    /**
     * 函数式风格创建对象，交给Spring进行管理
     */
    @Test
    public void txGenericApplicationContextTest() {
        // 1 创建GenericApplicationContext对象
        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        // 2 调用genericApplicationContext中的方法进行对象注册
        genericApplicationContext.refresh();
        genericApplicationContext.registerBean(Book.class, Book::new);
        // 3 获取在Spring注册的对象 全类路径
        Book book1 = genericApplicationContext.getBean(Book.class);
        Book book2 = (Book) genericApplicationContext.getBean("com.zt1994.entity.Book");
        System.out.println(book1);
        System.out.println(book2);
    }

}
