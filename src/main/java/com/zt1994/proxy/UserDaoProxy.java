package com.zt1994.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * UserDaoProxy
 *
 * @author zhongtao
 * @date 2022/5/8 16:07
 */
public class UserDaoProxy implements InvocationHandler {

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 增强逻辑
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前:" + method.getName() + ", 参数:" + Arrays.toString(args));
        // 被增强的方法执行
        Object res = method.invoke(obj, args);
        System.out.println("方法执行后:" + obj);
        return res;
    }
}
