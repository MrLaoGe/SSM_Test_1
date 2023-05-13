package com.example.app;

import com.example.app.dao.BookDao;
import com.example.app.dao.impl.BookDaoImpl;
import com.example.app.service.BookService;
import com.example.app.service.impl.BookServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 通过默认Java开发思路开发，多态
 */

/**
 * 教程 P0-11
 */
@SpringBootApplication
public class AppApplication {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }

}
