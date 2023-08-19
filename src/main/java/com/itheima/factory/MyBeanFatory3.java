package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * 延迟实例化Bean
 */
public class MyBeanFatory3 implements FactoryBean<UserDao> {
//    实现 FactoryBean ，泛形指定 UserDao
    @Override
    public UserDao getObject() throws Exception {
        System.out.println("getObject 被调用...");  // 创建对象的时候并不调用，等到对象被使用的时候就会调用getObject方法
        return new UserDaoImpl();  //会被缓存到 factoryBeanObjectCache 中
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
