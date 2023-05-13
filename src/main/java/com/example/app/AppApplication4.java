package com.example.app;

import com.example.app.dao.OrderDao;
import com.example.app.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppApplication4 {
    public static void main(String[] args) {

//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

//        使用静态实例化bean的方式实现orderDao
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }
}
