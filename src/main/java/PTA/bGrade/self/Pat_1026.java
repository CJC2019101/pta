package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/20 23:03
 * @Description 程序运行时间
 */
public class Pat_1026 {

    // 机器时钟每秒所走的时钟打点数
    private static int CLK_TCK = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 获取时钟打点数
        double C1 = sc.nextDouble();
        double C2 = sc.nextDouble();
        int seconds;
        seconds = (int) (((C2 - C1) / CLK_TCK) + 0.5);
        // 小时 %02d：打印最低两位不足两位用0补全，%2d：打印最低两位不足两位不补全。
        System.out.printf("%02d:", seconds / (60 * 60));
        // 分钟
        System.out.printf("%02d:", (seconds % (60 * 60)) / 60);
        // 秒
        System.out.printf("%02d", seconds % 60);
    }

}
