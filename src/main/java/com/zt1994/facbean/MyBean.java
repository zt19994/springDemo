package com.zt1994.facbean;

import com.zt1994.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * MyBean
 *
 * @author zhongtao
 * @date 2022/5/8 21:53
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
