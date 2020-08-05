package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/4/10 8:33
 * @Description 正整数 A 的“D A （为 1 位整数）部分”定义为由 A 中所有 D​A ​​  组成的新整数 P ​A ​​ 。
 * 例如：给定 A=3862767，D ​A ​​ =6，则 A 的“6 部分”P ​A ​​  是 66，因为 A 中有 2 个 6。
 */
public class Pat_1016 {
    public static int result(char[] pa, char da) {
        int result = 0;
        for (Character p : pa) {
            if (p.equals(da)) {
                result = result * 10 + Integer.valueOf(String.valueOf(p));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String pa; //
        String da;
        String pb;
        String db;
        Scanner sc = new Scanner(System.in);
        pa = sc.next();
        da = sc.next();
        pb = sc.next();
        db = sc.next();
        int result = result(pa.toCharArray(), da.charAt(0)) + result(pb.toCharArray(), db.charAt(0));
        System.out.println(result);
    }
}
