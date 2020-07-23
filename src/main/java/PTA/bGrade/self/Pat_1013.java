package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/14 20:21
 * @Description 令 P​i表示第 i 个素数。现任给两个正整数 M≤N≤10​4，请输出 P​M 到 P​N的所有素数。
 */
public class Pat_1013 {
    public static boolean isPrimeNumber(int number) {
        if (number <= 3) {
            return (number == 2) || (number == 3);
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int index = 0;
        int number = 0;
        int flag = 0;
        int m, n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        while (index <= n) {
            if (isPrimeNumber(++number)) {
                index++;
                if (index >= m && index < n) {
                    flag++;
                    System.out.print(number);
                    if (flag % 10 != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                } else if (index == n) {
                    System.out.print(number);
                }

            }
        }
    }
}
