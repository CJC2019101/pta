package PTA.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/1/28 11:04
 * @Description PTA.self
 */
public class pta1008 {
    public static void main(String[] args) {
        int n; // 数组长度
        int m; // 右移长度
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arras = new int[n];
        m = m % n;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                arras[i] = sc.nextInt();
            }
        } else {
            for (int i = m; i < n; i++) {
                arras[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arras[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arras[i] + " ");
        }
        System.out.println(arras[n - 1]);
    }
}
