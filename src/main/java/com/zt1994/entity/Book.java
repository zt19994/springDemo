package com.zt1994.entity;

/**
 * User
 *
 * @author zhongtao
 * @date 2022/5/9 22:28
 */
public class Book {

    private Integer bookId;

    private String bookName;

    private String bStatus;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getbStatus() {
        return bStatus;
    }

    public void setbStatus(String bStatus) {
        this.bStatus = bStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bStatus='" + bStatus + '\'' +
                '}';
    }
}
