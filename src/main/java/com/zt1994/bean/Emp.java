package com.zt1994.bean;

/**
 * 员工emp类
 *
 * @author zhongtao
 * @date 2022/5/8 21:34
 */
public class Emp {

    /**
     * 员工名称
     */
    private String empName;

    /**
     * 性别
     */
    private String gender;

    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println("empName:" + empName + ", gender:" + gender + ", dept:" + dept);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
