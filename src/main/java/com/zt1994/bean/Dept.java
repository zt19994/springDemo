package com.zt1994.bean;

/**
 * dept
 *
 * @author zhongtao
 * @date 2022/5/8 21:34
 */
public class Dept {

    private String deptName;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
