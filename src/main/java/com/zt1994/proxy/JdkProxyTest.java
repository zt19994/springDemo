package com.zt1994.proxy;

import com.zt1994.dao.UserDao;
import com.zt1994.dao.UserDaoImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author zhongtao
 * @date 2022/5/8 16:02
 */
public class JdkProxyTest {

    @Test
    public void main() {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao instance = (UserDao) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = instance.add(1, 2);
        System.out.println(result);
    }
}
