package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;

public class UserDaoImpl implements UserDao, InitializingBean {
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName; //在对象创建之后再手动注入值
    }

    public UserDaoImpl() {
        System.out.println("userDao实例化 - 无参构造");
    }

//    初始化方法
    public void init(){
        System.out.println("init初始化方法...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        属性填充后执行
        System.out.println("属性设置之后执行...");
    }

    @Override
    public void show() {
        System.out.println("UserDao: show...");
    }
}
