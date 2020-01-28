package PTA.bGrade.anwser;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/1/28 11:25
 * @Description PTA.anwser
 */
public class Answer1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数据个数
        int n = sc.nextInt();

        //需要偏移的个数
        int x = sc.nextInt();

        //存入数据
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //打印需要偏移的数据
        for (int i = n - x; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //打印剩下数据
        for (int i = 0; i < n - x - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        //打印最后一个数据不需要空格
        System.out.println(arr[n - x - 1]);
    }

}
