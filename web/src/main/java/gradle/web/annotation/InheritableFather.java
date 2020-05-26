package gradle.web.annotation;

/**
 * @Description: 父Inheritable
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 16:44
 */
@Inheritable
public class InheritableFather {
    public InheritableFather() {
        // InheritableBase是否具有 Inheritable Annotation
        System.out.println("InheritableFather:" + InheritableFather.class.isAnnotationPresent(Inheritable.class));
    }
}
