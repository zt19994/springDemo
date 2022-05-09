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

    /**
     * update book
     *
     * @param book
     */
    @Override
    public void update(Book book) {
        // 1 创建sql语句
        String sql = "UPDATE t_book SET book_name = ?, b_status = ? WHERE book_id = ?";
        // 2 调用方法实现
        jdbcTemplate.update(sql, book.getBookName(), book.getbStatus(), book.getBookId());
    }

    /**
     * del book
     *
     * @param id
     */
    @Override
    public void del(Integer id) {
        // 1 创建sql语句
        String sql = "DELETE FROM t_book WHERE book_id = ?";
        // 2 调用方法实现
        jdbcTemplate.update(sql, id);
    }
}
