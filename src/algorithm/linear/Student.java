package algorithm.linear;

import java.util.Objects;

/**
 * @description: 学生类
 * @author: guoyihua
 * @date: 2020/12/27
 */
public class Student {

    /**
     * 姓名
     */
    private String name;
    /**
     * 学生号
     */
    private int stuNum;

    public Student(String name, Integer stuNum) {
        this.name = name;
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return this.stuNum == student.stuNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stuNum);
    }
}
