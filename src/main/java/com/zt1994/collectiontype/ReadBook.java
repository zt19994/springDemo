package com.zt1994.collectiontype;

import java.util.List;

/**
 * ReadBook
 *
 * @author zhongtao
 * @date 2022/5/8 21:46
 */
public class ReadBook {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
