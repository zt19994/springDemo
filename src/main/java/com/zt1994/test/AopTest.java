package com.zt1994.test;


import com.zt1994.aopanno.User;
import com.zt1994.aopxml.Book;
import com.zt1994.config.AopConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AOP测试
 *
 * @author zhongtao
 * @date 2022/5/8 11:34
 */
public class AopTest {

    @Test
    public void aopAnnotationTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationAop.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void aopAnnotationTest2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void aopXmlTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationXml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
