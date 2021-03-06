package com.zt1994.dao;

import com.zt1994.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * BookDaoImpl
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

    /**
     * count
     *
     * @return
     */
    @Override
    public Integer selectCount() {
        // 1 创建sql语句
        String sql = "SELECT COUNT(1) FROM t_book";
        // 2 调用方法实现
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * selectBookInfo
     *
     * @param id
     * @return
     */
    @Override
    public Book selectBookInfo(Integer id) {
        // 1 创建sql语句
        String sql = "SELECT * FROM t_book WHERE book_id = ?";
        // 2 调用方法实现
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    /**
     * selectBookList
     *
     * @return
     */
    @Override
    public List<Book> selectBookList() {
        // 1 创建sql语句
        String sql = "SELECT * FROM t_book";
        // 2 调用方法实现
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
    }

    /**
     * batchAdd
     *
     * @param batchArgs
     */
    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        // 1 创建sql语句
        String sql = "INSERT INTO t_book values (?, ?, ?)";
        // 2 调用方法实现
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * batchUpdate
     *
     * @param batchArgs
     */
    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        // 1 创建sql语句
        String sql = "UPDATE t_book SET book_name = ?, b_status = ? WHERE book_id = ?";
        // 2 调用方法实现
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * batchDel
     *
     * @param batchArgs
     */
    @Override
    public void batchDel(List<Object[]> batchArgs) {
        // 1 创建sql语句
        String sql = "DELETE FROM t_book WHERE book_id = ?";
        // 2 调用方法实现
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
