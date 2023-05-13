package com.example.app.factory;

import com.example.app.dao.OrderDao;
import com.example.app.dao.impl.OrderDaoImpl;

//Factory 工厂

public class OrderDaoFactory {
    //静态实例化
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }

}
