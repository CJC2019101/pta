package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/1 13:21
 * @Description 给定区间 [−2​^31 ,2​^31] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
 */
public class PTA1011 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int testNumber = reader.nextInt(); // 测试用例组个数
        int resultNumber = 1; // 结果index
        long testCaseA; // [−2​^31 ,2​^31] 这是个闭区间
        long testCaseB;
        long testCaseC;
        for (int i = 1; i <= testNumber; i++) {
            testCaseA = reader.nextInt();
            testCaseB = reader.nextInt();
            testCaseC = reader.nextInt();
            System.out.println("Case #" + (resultNumber++) + ": " + (testCaseA + testCaseB > testCaseC));
        }
    }
}
