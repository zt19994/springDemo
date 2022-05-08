package com.zt1994.service;

import com.zt1994.dao.UserDao;

/**
 * @author zhongtao
 * @date 2022/5/8 21:25
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void update(){
        System.out.println("userService update");
        userDao.add(1, 2);
    }
}
