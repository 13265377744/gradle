package haday.demo.annotation;

import java.lang.annotation.*;

/**
 * @Description: @Target,@Retention,@Inherited,@Documented
 * 这四个是对注解进行注解的元注解，负责自定义的注解的属性
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 17:26
 */

@Target({ElementType.TYPE, ElementType.METHOD})    //表示注解的作用对象，ElementType.TYPE表示类，ElementType.METHOD表示方法
@Retention(RetentionPolicy.RUNTIME)        //表示注解的保留机制，RetentionPolicy.RUNTIME表示运行时注解
@Inherited            //表示该注解可继承
@Documented            //表示该注解可生成文档
public @interface Design {

    String author();        //注解成员，如果注解只有一个成员，则成员名必须为value()，成员类型只能为原始类型

    int data() default 0;    //注解成员，默认值为0
}
