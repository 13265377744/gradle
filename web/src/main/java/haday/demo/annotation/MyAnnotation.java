package haday.demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Description: Annotation在反射函数中的使用示例
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 17:07
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String[] value() default "unknown";

}
