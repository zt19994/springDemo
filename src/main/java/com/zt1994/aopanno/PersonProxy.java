package com.zt1994.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * person增强类
 *
 * @author zhongtao
 * @date 2022/5/8 14:22
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {

    /**
     * 相同切入点抽取
     */
    @Pointcut(value = "execution(* com.zt1994.aopanno.User.add(..))")
    public void pointDemo() {

    }

    /**
     * 前置通知
     */
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("Person before 前置通知");
    }
}
