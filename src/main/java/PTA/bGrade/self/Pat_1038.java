package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/8/4 10:33
 * @Description 统计同成绩学生 (20分)
 */
public class Pat_1038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grades[] = new int[101];
        for (int i = 0; i < n; i++) {
            grades[sc.nextInt()] += 1;
        }
        int k = sc.nextInt();
        for (int i = 0; i < k - 1; i++) {
            System.out.print(grades[sc.nextInt()] + " ");
        }
        System.out.print(grades[sc.nextInt()]);
    }

}
