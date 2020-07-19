package josephus_problem;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/19 15:12
 * @Description 约瑟夫问题
 */
public class JosephusProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        /* f(1,n) = 0;  // 0为下标，因为求余运算是从零开始的。*/
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        System.out.println("数组下标为：" + res);
    }
}
