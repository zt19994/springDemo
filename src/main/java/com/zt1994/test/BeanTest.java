package com.zt1994.test;

import com.zt1994.bean.*;
import com.zt1994.collectiontype.Course;
import com.zt1994.collectiontype.ReadBook;
import com.zt1994.collectiontype.Stu;
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

    /**
     * 注入内部bean和级联赋值
     */
    @Test
    public void beanTest5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    /**
     * 集合类型属性注入
     */
    @Test
    public void beanTest6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

        ReadBook readBook = context.getBean("readBook", ReadBook.class);
        readBook.test();
    }

    /**
     * FactoryBean
     */
    @Test
    public void beanTest7() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }

    /**
     * Bean的生命周期
     * 后置处理器 MyBeanPost
     */
    @Test
    public void beanTest8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationBean.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        // 手动让orders bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }
}
