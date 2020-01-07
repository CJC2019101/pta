package PTA.pta1004.modle;

/**
 * @author JianfeiChen
 * @date 2020/1/7 10:19
 * @Description PTA.pta1004.modle 学生类
 */
public class Student implements Comparable<Student> {

    private String name;
    private Double score; // 成绩
    @Override
    public int compareTo(Student that) {
        return 0;
    }
}
