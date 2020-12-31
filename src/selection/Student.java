package selection;

import java.util.Objects;

/**
 * @description: 学生类
 * @author: guoyihua
 * @date: 2020/12/27
 */
public class Student implements Comparable {

    /**
     * 姓名
     */
    private String name;
    /**
     * 学生号
     */
    private int stuNum;
    /**
     * 分数
     */
    private int score;

    public Student(String name, int stuNum, int score) {
        this.name = name;
        this.stuNum = stuNum;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNum=" + stuNum +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
        return this.getScore() - ((Student) obj).getScore();
    }
}
