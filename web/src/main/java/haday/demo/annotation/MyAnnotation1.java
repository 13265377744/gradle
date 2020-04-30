package haday.demo.annotation;


import java.lang.annotation.*;

/**
 * @Description: 我的第一个注解
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 16:30
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
}
