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
     * xml实现自动装配
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
}
