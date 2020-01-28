package PTA.bGrade.anwser;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/1/19 13:12
 * @Description PTA.anwser
 */
public class Answer1006 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ge = 0;
        int shi = 0;
        int bai = 0;
        ge = n % 10;
        n = n / 10;
        shi = n % 10;
        n = n / 10;
        bai = n % 10;
        for (int j = 0; j < bai; j++) {
            System.out.print("B");
        }
        for (int j = 0; j < shi; j++) {
            System.out.print("S");
        }
        int p = 1;
        while (p <= ge) {
            System.out.print(p);
            p++;
        }
    }

}
