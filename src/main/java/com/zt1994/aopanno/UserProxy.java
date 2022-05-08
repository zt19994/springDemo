package com.zt1994.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 *
 * @author zhongtao
 * @date 2022/5/7 21:39
 */
@Component
@Aspect
@Order(2)
public class UserProxy {

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
        System.out.println("before 前置通知");
    }

    /**
     * 后置通知
     */
    @After(value = "pointDemo()")
    public void after() {
        System.out.println("after 后置通知");
    }

    /**
     * 后置返回通知
     */
    @AfterReturning(value = "pointDemo()")
    public void afterReturning() {
        System.out.println("afterReturning 后置返回通知");
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing 后置异常通知");
    }

    /**
     * 环绕通知
     */
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around 环绕通知之前");
        // 执行方法
        proceedingJoinPoint.proceed();
        System.out.println("around 环绕通知之后");
    }
}