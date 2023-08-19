package com.itheima.test;

import com.itheima.beans.OtherBean;
import com.itheima.dao.PersonDao;
import com.itheima.dao.UserDao;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.ParseException;

/**
 * 实例工厂 - 非静态工厂
 */
public class ApplicationContextTest {
    public static void main(String[] args) throws ParseException, IOException {
        // ApplicationContext 是一个接口
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        UserDao userDao1 = (UserDao) applicationContext.getBean("userDao1");
//        System.out.println(userDao1);
//        applicationContext.close();// 关闭容器

//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.show();

//        指定环境为test
//        System.setProperty("spring.profiles.active","test");
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        UserDao userService = (UserDao) applicationContext.getBean("userDao");
//        System.out.println(userService);

//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        UserService userService = (UserService) applicationContext.getBean("xxx");
//        System.out.println(userDao);
//        System.out.println(userService);

//        获取bean的get方法
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        通过名字获取，需要强转类型
//        UserService userService1 = (UserService) applicationContext.getBean("userService");
//        通过名字和类型获取，可以不用类型转换
//        UserService userService2 = applicationContext.getBean("userService", UserService.class);
//        通过类型获取,有多个相同类型的bean会报错
//        UserService userService3 = applicationContext.getBean(UserService.class);

//        ===========================================
//        测试 DruidDataSource 是否配置成功
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);

//        配置connection(测试)
//        Class.forName("com.mysql.jdbc.Driver"); // 加载驱动 => 静态工厂方式
//        Connection connection = DriverManager.getConnection("", "", "");
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        Object connection = applicationContext.getBean("connection");
//        System.out.println(connection);

//        配置日期对象(测试)
//        String currentTimeStr = "2023-08-27 07:20:00";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date parse = simpleDateFormat.parse(currentTimeStr);
//        System.out.println(parse);

//        配置 mybatis
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");  //引入配置文件（Resources是ibatis的）
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder(); // new 一个构造器
//        SqlSessionFactory sqlSessionFactory = builder.build(in);  // 构建工厂
//        System.out.println(sqlSessionFactory);
//        (测试)
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
//        System.out.println(sqlSessionFactory);

//        测试 BeanFactoryPostProcessor 对 bean 的 class 修改
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        Object userService = applicationContext.getBean("userService");
//        System.out.println(userService);

//        测试 BeanFactoryPostProcessor 对 bean 的 class 修改
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        Object userService = applicationContext.getBean("userService");
//        System.out.println(userService);

//        动态注册Bean
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        Object PersonDao = applicationContext.getBean(PersonDao.class);
//        System.out.println(PersonDao);

//        测试自定义@component
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        Object otherBean = applicationContext.getBean(OtherBean.class);
//        System.out.println(otherBean);

//        测试Bean后处理器
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");

//        测试 Bean 后处理器 – BeanPostProcessor
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        Object userDao = applicationContext.getBean("userDao");

//        测试日期增强
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.show();

//        测试 - Spring整合MyBatis
//        测试配置 context
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextTest.xml");
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.show();
    }
}
