package com.zt1994.dao;

import com.zt1994.entity.Book;

/**
 * BookDao
 *
 * @author zhongtao
 * @date 2022/5/9 22:18
 */
public interface BookDao {

    /**
     * add book
     * @param book
     */
    void add(Book book);
}