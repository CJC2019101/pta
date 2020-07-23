package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author JianfeiChen
 * @date 2020/3/22 18:43
 * @Description 现给出一批考生的德才分数，请根据司马光的理论给出录取排名。
 */

public class Pat_1015 {

    public static class Student implements Comparable<Student> {
        private String id; // 学号
        private int de; // 德分
        private int cai; // 才分

        public Student(String id, int de, int cai) {
            this.id = id;
            this.de = de;
            this.cai = cai;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getDe() {
            return de;
        }

        public void setDe(int de) {
            this.de = de;
        }

        public int getCai() {
            return cai;
        }

        public void setCai(int cai) {
            this.cai = cai;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.de + this.cai, other.de + other.cai);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = reader.readLine().split("\\s");
        int n = Integer.parseInt(inputLine[0]); // 学生总人数
        int pass = Integer.parseInt(inputLine[1]); // 及格分数线
        int perfect = Integer.parseInt(inputLine[2]); // 优秀学生分数线
        String stuId;
        int stuDe;
        int stuCai;
        List<Student> students_AllPerfect = new LinkedList<>(); // 优秀学生
        List<Student> students_Others = new LinkedList<>(); // 达到最低分数线
        List<Student> students_DePerfect = new LinkedList<>(); // 德胜才学生
        List<Student> students_Depass = new LinkedList<>(); // “才德兼亡”但尚有“德胜才”者
        int index = 0;
        while (index < n) {
            String[] student_info = reader.readLine().split("\\s");
            stuId = student_info[0];
            stuDe = Integer.parseInt(student_info[1]);
            stuCai = Integer.parseInt(student_info[2]);
            index++;
            if (stuDe >= perfect && stuDe <= 100) {
                if (stuCai >= perfect) {
                    students_AllPerfect.add(new Student(stuId, stuDe, stuCai));
                } else if (stuCai >= pass) {
                    students_DePerfect.add(new Student(stuId, stuDe, stuCai));
                }
            } else if ((stuDe >= pass && stuDe < perfect) && stuDe >= stuCai && stuCai >= pass) {
                students_Depass.add(new Student(stuId, stuDe, stuCai));
            } else if ((stuDe >= pass && stuDe < perfect) && stuCai >= pass) {
                students_Others.add(new Student(stuId, stuDe, stuCai));
            }
        }
        Collections.reverse(students_AllPerfect);
        Collections.reverse(students_DePerfect);
        Collections.reverse(students_Depass);
        Collections.reverse(students_Others);
        System.out.println(students_AllPerfect.size() + students_DePerfect.size() + students_Depass.size() + students_Others.size());
        for (Student stu : students_AllPerfect) {
            System.out.println(stu.getId() + " " + stu.getDe() + " " + stu.getCai());
        }
        for (Student stu : students_DePerfect) {
            System.out.println(stu.getId() + " " + stu.getDe() + " " + stu.getCai());
        }
        for (Student stu : students_Depass) {
            System.out.println(stu.getId() + " " + stu.getDe() + " " + stu.getCai());
        }
        for (Student stu : students_Others) {
            System.out.println(stu.getId() + " " + stu.getDe() + " " + stu.getCai());
        }
    }
}
