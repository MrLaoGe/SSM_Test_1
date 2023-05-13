package com.example.app.dao.impl;

import com.example.app.dao.BookDao;

/**
 * dao 数据层
 */
public class BookDaoImpl implements BookDao {

    // 使用构造方法来实例化bean，并且需要是无参
    public BookDaoImpl(){
        System.out.println("bookDao构造方法...");
    }

    public void save(){
        System.out.println("BookDao的save()");
    }
}
