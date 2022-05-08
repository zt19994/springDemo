package com.zt1994.aopxml;

import org.aspectj.lang.annotation.Before;

/**
 * book增强类
 *
 * @author zhongtao
 * @date 2022/5/8 15:16
 */
public class BookProxy {

    public void before() {
        System.out.println("book before 前置通知");
    }
}
