package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/1/19 11:34
 * @Description 换个格式输出整数，百位：B、十位：S、个位：1~n表示（n<10）。
 */
public class pta1006 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        if (integer < 999) {
            otherStyle(integer);
        }
    }


    public static void otherStyle(int integer) {
        StringBuffer sb = new StringBuffer();
        for (int i = 2; i > -1; i--) {
            for (int j = 0; j < integer % 10; j++) {
                if (i == 2) {
                    sb.append((integer % 10) - j);
                } else if (i == 1) {
                    sb.append("S");
                } else {
                    sb.append("B");
                }
            }
            integer /= 10;
        }
        System.out.print(sb.reverse().toString().trim());
    }


}
