package com.zt1994.test;

import com.zt1994.entity.Book;
import com.zt1994.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * JdbcTemplateTest
 *
 * @author zhongtao
 * @date 2022/5/9 22:40
 */
public class JdbcTemplateTest {

    /**
     * jdbcTemplateAddTest
     */
    @Test
    public void jdbcTemplateAddTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("IT BOOK");
        book.setbStatus("Y");
        bookService.addBook(book);
    }

    /**
     * jdbcTemplateUpdateTest
     */
    @Test
    public void jdbcTemplateUpdateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("JAVA BOOK");
        book.setbStatus("N");
        bookService.updateBook(book);
    }

    /**
     * jdbcTemplateDelTest
     */
    @Test
    public void jdbcTemplateDelTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.delBook(1);
    }
}
