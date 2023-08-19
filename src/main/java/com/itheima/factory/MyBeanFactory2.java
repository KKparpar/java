package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class MyBeanFactory2 {
    // 实例化工厂方式 - 构造bean的方法，不是构造方法
    public UserDao userDao(String name,int age){
        //Bean创建之前可以进行一些其他业务逻辑操作
        return new UserDaoImpl();  // 缓存到 singletonObjects 中
    }
}
