package com.itheima.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("beanDefinitionMap 填充完毕后回调该方法");

//        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
//        根据bean名字，将Bean的class进行修改
//        beanDefinition.setBeanClassName("com.itheima.dao.impl.UserDaoImpl");

//        动态注册Bean
//        注册 BeanDefinition
//        BeanDefinition beanDefinition = new RootBeanDefinition();
//        beanDefinition.setBeanClassName("com.itheima.dao.impl.PersonDaoIDaoImpl");
//        强转成 DefaultListableBeanFactory
//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
//        defaultListableBeanFactory.registerBeanDefinition("PersonDaoImpl",beanDefinition);


    }
}
