package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * 静态工厂
 */
public class MyBeanFatory1 {
//    静态方法 - 构造bean的方法，不是构造方法
    public static UserDao userDao(String name,int age){
        //Bean创建之前可以进行一些其他业务逻辑操作
        return new UserDaoImpl(); //将返回的对象存储到 spring容器（ singletonObjects ） 中
    }
}
