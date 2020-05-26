package gradle.web.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 10:43
 */

public class Favorites<E> {

    private Map<Class<?>, Object> favorites =
            new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null)
            throw new NullPointerException("Type is null");
        favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[0] = " + args[1]);
    }
}
