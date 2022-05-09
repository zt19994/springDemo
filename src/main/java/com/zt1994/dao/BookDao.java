package com.zt1994.dao;

import com.zt1994.entity.Book;

import java.util.List;

/**
 * BookDao
 *
 * @author zhongtao
 * @date 2022/5/9 22:18
 */
public interface BookDao {

    /**
     * add book
     *
     * @param book
     */
    void add(Book book);

    /**
     * update book
     *
     * @param book
     */
    void update(Book book);

    /**
     * del book
     *
     * @param id
     */
    void del(Integer id);

    /**
     * count
     *
     * @return
     */
    Integer selectCount();

    /**
     * selectBookInfo
     *
     * @param id
     * @return
     */
    Book selectBookInfo(Integer id);

    /**
     * selectBookList
     *
     * @return
     */
    List<Book> selectBookList();

}
