package com.zt1994.service;

import com.zt1994.dao.BookDao;
import com.zt1994.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BookService
 *
 * @author zhongtao
 * @date 2022/5/9 22:18
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    /**
     * add book
     *
     * @param book
     */
    public void addBook(Book book) {
        bookDao.add(book);
    }

    /**
     * update book
     *
     * @param book
     */
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    /**
     * del book
     *
     * @param id
     */
    public void delBook(Integer id) {
        bookDao.del(id);
    }

    /**
     * count book
     *
     * @return
     */
    public int countBook() {
        return bookDao.selectCount();
    }

    /**
     * find book
     *
     * @param id
     * @return
     */
    public Book findBook(Integer id) {
        return bookDao.selectBookInfo(id);
    }

    /**
     * findBookList
     *
     * @return
     */
    public List<Book> findBookList() {
        return bookDao.selectBookList();
    }

    /**
     * batchAdd
     *
     * @param batchArgs
     */
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAdd(batchArgs);
    }
}
