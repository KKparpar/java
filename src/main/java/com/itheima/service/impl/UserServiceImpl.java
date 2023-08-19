package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;

public class UserServiceImpl implements UserService,ServletContextAware,
        ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    public UserServiceImpl() {
        System.out.println("UserServiceImpl实例化 - 无参构造");
    }

    //    //    注入List
////    方法一：
//    private List<String> stringList;
////    生成set方法
//    public void setStringList(List<String> stringList) {
//        this.stringList = stringList;
//    }
//    //    方法二：
//    private List<UserDao> userDaoList;
//    //    生成set方法
//    public void setUserDaoList(List<UserDao> userDaoList) {
//        this.userDaoList = userDaoList;
//    }
    //    打印方法 - 需要在接口编写抽象方法
    public void show(){
//        System.out.println(stringList);
//        System.out.println(userDaoList);
        System.out.println(userDao);
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    //    无参构造
//    public UserServiceImpl(){
//        System.out.println("UserServiceImpl(无参构造方法)实例化");
//    }
//    public UserServiceImpl(String name,int age){
//        System.out.println("UserServiceImpl(有参构造方法)实例化");
//    }

    private UserDao userDao;
//    属性设置
//    BeanFactory去调用该方法 从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
//        System.out.println(userDao);
//        System.out.println("属性设置...");
        System.out.println("UserServiceImpl 执行 userDao注入 操作");
    }


    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println(servletContext); //目前不会执行，需要有外部 Web 环境才会执行
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName);
    }

//    注入UserMapper
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}














