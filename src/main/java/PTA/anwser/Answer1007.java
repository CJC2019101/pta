package PTA.anwser;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/1/28 11:29
 * @Description PTA.anwser
 */
public class Answer1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int primeNumber1;
        int primeNumber2 = -2;
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                primeNumber1 = primeNumber2;
                primeNumber2 = i;
                if (primeNumber2 - primeNumber1 == 2) {
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static boolean isPrimeNumber(int num) {
        if (num < 10) {
            return num == 2 || num == 3 || num == 5 || num == 7;
        }
        //因为任何一个数都不可能分解成两个大于其平方根的数的乘积.肯定只能分解为一个大于或等于其平方根,另一个小于或等于其平方根.
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        System.out.print(num + " ");
        return true;
    }
}
