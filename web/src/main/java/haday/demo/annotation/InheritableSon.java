package haday.demo.annotation;

/**
 * @Description: 子Inheritable
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 16:45
 */

public class InheritableSon extends InheritableFather {

    public InheritableSon() {
        super();    // 调用父类的构造函数
        // InheritableSon类是否具有 Inheritable Annotation
        System.out.println("InheritableSon:" + InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }

    public static void main(String[] args) {
        InheritableSon is = new InheritableSon();
    }
}
