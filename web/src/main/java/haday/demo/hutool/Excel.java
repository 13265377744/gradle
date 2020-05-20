package haday.demo.hutool;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

import java.util.Collections;
import java.util.List;

/**
 * @Description: 导入导出
 * @Author: dingj
 * @DATA: 2020/5/9
 * @TIME: 9:42
 */

public class Excel {

    public static void main(String[] args) {
        TestBean bean1 = new TestBean();
        bean1.setName("张三");
        bean1.setAge(22);
        bean1.setPass(true);
        bean1.setScore(66.30);
        bean1.setExamDate(DateUtil.date());

        TestBean bean2 = new TestBean();
        bean2.setName("李四");
        bean2.setAge(28);
        bean2.setPass(false);
        bean2.setScore(38.50);
        bean2.setExamDate(DateUtil.date());

        List<TestBean> rows = CollUtil.newArrayList(bean1, bean2);

        // 通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getWriter("D:/tmp/BeanTest"+ RandomUtil.randomNumber()+".xlsx");
        writer.writeHeadRow(Collections.emptyList());
        writer.writeHeadRow(Collections.emptyList());

        //自定义标题别名
        writer.addHeaderAlias("name", "姓名");
        writer.addHeaderAlias("age", "年龄");
        writer.addHeaderAlias("score", "分数");
        writer.addHeaderAlias("isPass", "是否通过");
        writer.addHeaderAlias("examDate", "考试时间");

        // 合并单元格后的标题行，使用默认标题样式
        // 合并单元格后的标题行，使用默认标题样式
        writer.merge(0, 0, 0, 2, "项目基本信息", false);
        writer.merge(0, 0, 3, 4, "项目基本信息", false);
        writer.merge(1, 1, 0, 2, "项目基本信息", false);
        writer.merge(1, 1, 3, 4, "项目基本信息", false);
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(rows, true);
        // 关闭writer，释放内存
        writer.close();


    }

}
