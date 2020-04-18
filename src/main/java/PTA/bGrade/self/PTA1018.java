package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/4/17 11:03
 * @Description 剪刀石头布
 */
public class PTA1018 {
    public static int jB = 0, jC = 0, jJ = 0; // 甲
    public static int yB = 0, yC = 0, yJ = 0; // 乙

    public static int compare(String jia, String yi) {
        if (jia.equals(yi)) { // 平局
            return 0;
        } else if ((jia.equals("C") && yi.equals("J")) ||
                (jia.equals("J") && yi.equals("B")) ||
                (jia.equals("B") && yi.equals("C"))) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void addJia(String str) {
        if (str.equals("C")) {
            jC++;
        } else if (str.equals("B")) {
            jB++;
        } else if (str.equals("J")) {
            jJ++;
        }
    }

    public static void addYi(String str) {
        if (str.equals("C")) {
            yC++;
        } else if (str.equals("B")) {
            yB++;
        } else if (str.equals("J")) {
            yJ++;
        }
    }

    // 比较大小
    public static String maxValue(Integer jB, Integer jC, Integer jJ) {
        if (jB >= jC && jC >= jJ) {
            return "B";
        } else if (jC >= jJ) {
            return "C";
        } else if (jB >= jJ) {
            return "B";
        }else {
            return "J";
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String jia;
        String yi;
        int pingJu = 0;
        for (int i = 0; i < n; i++) {
            jia = sc.next();
            yi = sc.next();
            int compare = compare(jia, yi);
            if (compare == 1) { // 甲赢
                addJia(jia);
            } else if (compare == -1) { // 乙赢
                addYi(yi);
            } else { // 平局
                pingJu++;
            }
        }
        System.out.println((jB + jC + jJ) + " " + pingJu + " " + ((n) - (jB + jC + jJ + pingJu)));
        System.out.println((yB + yC + yJ) + " " + pingJu + " " + ((n) - (yB + yC + yJ + pingJu)));
        System.out.println(maxValue(jB, jC, jJ) + " " + maxValue(yB, yC, yJ));
    }
}
