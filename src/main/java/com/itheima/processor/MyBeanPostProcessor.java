package com.itheima.processor;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        bean对象创建完毕执行
        if (bean instanceof UserDao){
//            如果bean是UserDao
            UserDaoImpl userDao = (UserDaoImpl) bean;
            userDao.setUserName("haohao"); //在对象创建之后再手动注入值
        }
        System.out.println(beanName+": postProcessBeforeInitialization执行...");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        后执行
        System.out.println(beanName+": postProcessAfterInitialization执行...");
        return null;
    }
}
