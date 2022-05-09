package com.zt1994.service;

import com.zt1994.dao.BookDao;
import com.zt1994.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * @param book
     */
    public void addBook(Book book) {
        bookDao.add(book);
    }
}
