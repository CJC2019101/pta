package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/29 9:00
 * @Description 有理数四则运算 (20分)
 */
public class Pat_1034 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num_1 = sc.next();
        String num_2 = sc.next();
        String[] array_1 = num_1.split("/");
        String[] array_2 = num_2.split("/");
    }

    //求最大公约数
//    public static int method(int x, int y) {
//        int a, b, c;
//        a = x;
//        b = y;
//        /* 余数不为0，继续相除，直到余数为0 */
//        while (b != 0) {
//            c = a % b;
//            a = b;
//            b = c;
//        }
//        return a;
//    }

    //求最小的公倍数
    public static int multiple(int x, int y) {
        int z;
        for (z = x; ; z++) {
            if (z % x == 0 && z % y == 0) {
                break;
            }
        }
        return z;
    }

}
