package haday.demo.test;

import java.util.*;

/**
 * @Description: http://www.ahwang.cn/ent/20200430/2047476.html
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 8:20
 */

public class Effective {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }


    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // Generic method
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    // Generic singleton factory pattern
    private static UnaryFunction<Object> IDENTITY_FUNCTION =
            new UnaryFunction<Object>() {
                public Object apply(Object arg) {
                    return arg;
                }
            };

    // IDENTITY_FUNCTION is stateless and its type parameter is
    // unbounded so it's safe to share one instance across all types.
    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    // Returns the maximum value in a list - uses recursive type bound
    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }

}
