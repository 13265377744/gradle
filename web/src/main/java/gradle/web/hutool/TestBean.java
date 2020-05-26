package gradle.web.hutool;

import java.util.Date;

/**
 * @Description: 测试
 * @Author: dingj
 * @DATA: 2020/5/9
 * @TIME: 9:42
 */

public class TestBean {
    private String name;
    private int age;
    private double score;
    private boolean isPass;
    private Date examDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean isPass) {
        this.isPass = isPass;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}

