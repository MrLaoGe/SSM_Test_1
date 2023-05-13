package com.example.app.dao.impl;

import com.example.app.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("OrderDao的save()");
    }
}
