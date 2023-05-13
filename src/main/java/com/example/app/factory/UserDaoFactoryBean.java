package com.example.app.factory;

import com.example.app.dao.UserDao;
import com.example.app.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return (UserDao) new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    /*
    控制实例对象是否是单例的
    false为非单例
    true为单例
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
