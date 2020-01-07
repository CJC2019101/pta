package PTA.anwser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/1/7 15:35
 * @Description PTA.anwser 算出所有结果集、凡是结果集中出现的输入列数肯定不是 关键数
 */
public class Answer1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        //for循环将输入数据存入a1 a2数组
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
            a1[i] = a2[i];

            //分两种 if 判断数据，并将在计算过程中遇到的数，全部储存在arr1中
            while (a1[i] != 1) {
                if (a1[i] % 2 == 0) {
                    a1[i] /= 2;
                    if (!arr1.contains(a1[i])) {
                        arr1.add(a1[i]);
                    } else {
                        //如果存在 a1[i] 则break跳过
                        break;
                    }
                } else {
                    a1[i] = (3 * a1[i] + 1) / 2;
                    if (!arr1.contains(a1[i])) {
                        arr1.add(a1[i]);
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < a2.length; i++) { // 获取关键数
            if (!arr1.contains(a2[i])) {
                arr2.add(a2[i]);
            }
        }
        //默认升序排序（从小到大）
        Collections.sort(arr2);

        //判断数组不为空
        if (arr2.size() == 1) {
            //get(0) 获取第1个元素
            System.out.println(arr2.get(0));
        } else {
            //for循环从大到小排序
            for (int i = arr2.size() - 1; i >= 0; i--) {
                System.out.print(arr2.get(i));
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
