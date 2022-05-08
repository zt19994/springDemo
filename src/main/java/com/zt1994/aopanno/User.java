package com.zt1994.aopanno;

import org.springframework.stereotype.Component;

/**
 * 被增强类
 *
 * @author zhongtao
 * @date 2022/5/7 21:37
 */
@Component
public class User {

    /**
     * add
     */
    public void add() {
        // int s = 1/0;
        System.out.println("add 方法执行中");
    }
}