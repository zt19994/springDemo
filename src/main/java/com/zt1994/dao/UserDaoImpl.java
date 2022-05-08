package com.zt1994.dao;

/**
 * UserDaoImpl
 *
 * @author zhongtao
 * @date 2022/5/8 16:04
 */
public class UserDaoImpl implements UserDao {

    /**
     * add
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int add(int a, int b) {
        System.out.println("方法执行中");
        return a + b;
    }
}
