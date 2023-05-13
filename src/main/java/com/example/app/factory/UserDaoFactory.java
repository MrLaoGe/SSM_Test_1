package com.example.app.factory;

import com.example.app.dao.UserDao;
import com.example.app.dao.impl.UserDaoImpl;

public class UserDaoFactory {

    //实力工厂初始化bean
    public UserDao getUserDao(){
        return (UserDao) new UserDaoImpl();
    }
}
