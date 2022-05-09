package com.zt1994.dao;

import com.zt1994.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * BookImpl
 *
 * @author zhongtao
 * @date 2022/5/9 22:18
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * add book
     *
     * @param book
     */
    @Override
    public void add(Book book) {
        // 1 创建sql语句
        String sql = "INSERT INTO t_book values (?, ?, ?)";
        // 2 调用方法实现
        int add = jdbcTemplate.update(sql, book.getBookId(), book.getBookName(), book.getbStatus());
        System.out.println(add);
    }
}
