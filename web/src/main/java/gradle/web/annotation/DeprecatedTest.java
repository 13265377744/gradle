package gradle.web.annotation;

import java.util.Calendar;
import java.util.Date;

/**
 * @Description: Deprecated测试
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 16:40
 */

public class DeprecatedTest {

    // @Deprecated 修饰 getString1(),表示 它是建议不被使用的函数
    @Deprecated
    private static void getString1() {
        System.out.println("Deprecated Method");
    }

    private static void getString2() {
        System.out.println("Normal Method");
    }

    // Date是日期/时间类。java已经不建议使用该类了
    private static void testDate() {
        Date date = new Date(113, 8, 25);
        System.out.println(date.getYear());
    }

    // Calendar是日期/时间类。java建议使用Calendar取代Date表示"日期/时间"
    private static void testCalendar() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
    }

    public static void main(String[] args) {
        getString1();
        getString2();
        testDate();
        testCalendar();
    }
}
