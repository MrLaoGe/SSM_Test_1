package com.example.app;

import com.example.app.dao.BookDao;
import com.example.app.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 采用IoC思维来开发
 * 类似于反射技术
 */
public class AppApplication2 {
    public static void main(String[] args) {
        //3.获取Ioc容器
        ApplicationContext aC = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.获取beam，这里就避免通过new来创建对象，而是通过方法来获取对象
//        BookDao bookDao = (BookDao) aC.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) aC.getBean("bookEbi");
        BookService bookService1 = (BookService) aC.getBean("bookEbi");
        bookService.save();
        //这里运行后地址是不一样的，因为在xml设置了bean为非单例，如果采用默认单例，那么他们的地址就会一样
        System.out.println(bookService);
        System.out.println(bookService1);

    }
}
