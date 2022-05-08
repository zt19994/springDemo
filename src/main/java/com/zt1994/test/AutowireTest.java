package com.zt1994.test;

import com.zt1994.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongtao
 * @date 2022/5/8 22:20
 */
public class AutowireTest {

    /**
     * xml实现自动装配
     */
    @Test
    public void autowireTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationAutowire.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
