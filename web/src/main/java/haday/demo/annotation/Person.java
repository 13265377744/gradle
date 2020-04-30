package haday.demo.annotation;

/**
 * @Description: Person类。它会使用MyAnnotation注解
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 17:08
 */

public class Person {

    /**
     * empty()方法同时被 "@Deprecated" 和 "@MyAnnotation(value={"a","b"})"所标注
     * (01) @Deprecated，意味着empty()方法，不再被建议使用
     * (02) @MyAnnotation, 意味着empty() 方法对应的MyAnnotation的value值是默认值"unknown"
     */
    @MyAnnotation
    @Deprecated
    public void empty() {
        System.out.println("\nempty");
    }

    /**
     * sombody() 被 @MyAnnotation(value={"girl","boy"}) 所标注，
     *
     * @MyAnnotation(value={"girl","boy"}), 意味着MyAnnotation的value值是{"girl","boy"}
     */
    @MyAnnotation(value = {"girl", "boy"})
    public void somebody(String name, int age) {
        System.out.println("\nsomebody: " + name + ", " + age);
    }
}
