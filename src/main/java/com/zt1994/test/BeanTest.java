package com.zt1994.test;

import com.zt1994.bean.Cat;
import com.zt1994.bean.Dog;
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
}
