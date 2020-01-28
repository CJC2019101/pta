package PTA.bGrade.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/1/7 10:02
 * @Description 成绩排名
 */
public class pta1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        int size = sc.nextInt();
        Student student;
        for (int i = 0; i < size; i++) {
            student = new Student();
            student.setName(sc.next());
            student.setStudentId(sc.next());
            student.setScore(sc.nextDouble());
            students.add(student);
        }
        Collections.sort(students);
        System.out.println(students.get(0).toString()); // 第一名
        System.out.println(students.get(size - 1).toString()); // 最后一名
    }
}

class Student implements Comparable<Student> {

    private String name;
    private Double score; // 成绩
    private String studentId; // 学号

    public Student(String name, Double score, String studentId) {
        this.name = name;
        this.score = score;
        this.studentId = studentId;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return this.name + " " + this.studentId;
    }

    @Override
    public int compareTo(Student that) {
        if (this.score > that.score) {
            return -1;
        } else if (this.score < that.score) {
            return 1;
        }
        return 0;
    }
}
