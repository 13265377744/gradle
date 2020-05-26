package gradle.web.annotation;

import java.lang.annotation.*;

/**
 * @Description: 自定义的Annotation
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 16:44
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Inherited
public @interface Inheritable {
}
