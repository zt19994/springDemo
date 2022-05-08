package com.zt1994.test;

import com.zt1994.bean.Apple;
import com.zt1994.bean.Cat;
import com.zt1994.bean.Dog;
import com.zt1994.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanTest
 *
 * @author zhongtao
 * @date 2022/5/8 17:36
 */
public class BeanTest {

    /**
     * 使用set注入参数
     */
    @Test
    public void beanTest1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat.getName());
        System.out.println(cat);
    }

    /**
     * 使用有参构造函数注入
     */
    @Test
    public void beanTest2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog.getName());
        System.out.println(dog);
    }

    /**
     * P名称空间注入
     */
    @Test
    public void beanTest3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        Apple apple = context.getBean("apple", Apple.class);
        System.out.println(apple.getName());
        System.out.println(apple);
    }

    /**
     * 注入外部bean
     */
    @Test
    public void beanTest4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.update();
    }
}
