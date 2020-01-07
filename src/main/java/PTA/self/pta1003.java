package PTA.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2019/12/31 16:03
 */
public class pta1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] ptas = new String[len];
        boolean[] yesOrNot = new boolean[len];
        for (int i = 0; i < len; i++) {
            ptas[i] = sc.next();
            for (int j = 0; j < ptas[i].length(); j++) {
                if (ptas[i].charAt(j) != 'P' && ptas[i].charAt(j) != 'A' && ptas[i].charAt(j) != 'T') {
                    yesOrNot[i] = false;
                }
            }
            if (ptas[i].length() >= 2 || ptas[i].length() < 7) {
//                ptas[i].
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(ptas[i]);
        }
    }
}
