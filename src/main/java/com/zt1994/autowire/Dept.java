package com.zt1994.autowire;

/**
 * Dept
 *
 * @author zhongtao
 * @date 2022/5/8 22:15
 */
public class Dept {

    /**
     * name
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
