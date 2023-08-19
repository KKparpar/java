package com.itheima.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  //指定在类上面使用
@Retention(RetentionPolicy.RUNTIME)  //注解的存活范围 - 运行期间可见
public @interface MyComponent {
    //显示的指定Bean的beanName
    String value();
}