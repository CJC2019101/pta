package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/8/29 10:54
 * @Description https://pintia.cn/problem-sets/994805260223102976/problems/994805277847568384
 */
public class Pat_1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jia = 0;
        int yi = 0;
        int n = sc.nextInt();
        int jia_han, jia_hua;
        int yi_han, yi_hua;
        for (int i = 0; i < n; i++) {
            jia_hua = sc.nextInt();
            jia_han = sc.nextInt();
            yi_hua = sc.nextInt();
            yi_han = sc.nextInt();
            if (jia_han != yi_han) {
                if (jia_han == (jia_hua + yi_hua)) {
                    yi++;
                } else if (yi_han == (jia_hua + yi_hua)) {
                    jia++;
                }
            }
        }
        System.out.println(jia + " " + yi);
    }
}
