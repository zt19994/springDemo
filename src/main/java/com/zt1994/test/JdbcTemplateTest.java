package com.zt1994.test;

import com.zt1994.entity.Book;
import com.zt1994.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * jdbcTemplateQueryCountTest
     */
    @Test
    public void jdbcTemplateQueryCountTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.countBook());
    }

    /**
     * jdbcTemplateQueryForObjectTest
     */
    @Test
    public void jdbcTemplateQueryObjectTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findBook(1));
    }

    /**
     * jdbcTemplateQueryListTest
     */
    @Test
    public void jdbcTemplateQueryListTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findBookList());
    }

    /**
     * jdbcTemplateBatchAddTest
     */
    @Test
    public void jdbcTemplateBatchAddTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3", "java", "a"};
        Object[] o2 = {"4", "java", "a"};
        Object[] o3 = {"5", "java", "a"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }

    /**
     * jdbcTemplateBatchUpdateTest
     */
    @Test
    public void jdbcTemplateBatchUpdateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"C++", "B", "3"};
        Object[] o2 = {"C++", "B", "4"};
        Object[] o3 = {"C++", "B", "5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);
    }

    /**
     * jdbcTemplateBatchUpdateTest
     */
    @Test
    public void jdbcTemplateBatchDelTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDel(batchArgs);
    }
}
