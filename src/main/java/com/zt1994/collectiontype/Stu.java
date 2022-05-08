package com.zt1994.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * stu
 *
 * @author zhongtao
 * @date 2022/5/8 21:41
 */
public class Stu {

    /**
     * 数组类型 课程
     */
    private String[] courses;

    /**
     * list类型
     */
    private List<String> list;

    /**
     * map类型
     */
    private Map<String, String> maps;

    /**
     * set类型
     */
    private Set<String> sets;

    /**
     * 课程列表
     */
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void test() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
