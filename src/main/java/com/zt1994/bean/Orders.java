package com.zt1994.bean;

/**
 * Orders
 *
 * @author zhongtao
 * @date 2022/5/8 22:04
 */
public class Orders {

    public Orders() {
        System.out.println("第一步 执行无参构造函数创建bean实例");
    }

    private String orderName;

    public void setOrderName(String orderName) {
        this.orderName = orderName;
        System.out.println("第二步 调用set方法设置属性值");
    }

    /**
     * 创建执行的初始化方法
     */
    public void initMethod() {
        System.out.println("第三步 执行初始化的方法");
    }

    /**
     * 创建执行的销毁方法
     */
    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }
}
