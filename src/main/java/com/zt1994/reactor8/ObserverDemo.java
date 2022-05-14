package com.zt1994.reactor8;

import java.util.Observable;

/**
 * 观察者demo
 *
 * @author zhongtao
 * @date 2022/5/14 15:32
 */
public class ObserverDemo extends Observable {

    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        // 添加观察者
        observerDemo.addObserver((o, arg) -> {
            System.out.println("发生了变化");
        });
        observerDemo.addObserver((o, arg) -> {
            System.out.println("收到被观察者通知，准备改变");
        });
        // 数据变化
        observerDemo.setChanged();
        // 通知
        observerDemo.notifyObservers();

    }
}
