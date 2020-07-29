package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/29 19:41
 * @Description 跟奥巴马一起编程 (15分)
 */
public class Pat_1036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double line = sc.nextInt();
        String str = sc.next();
        // 列
//        int row = (int) (line / 2 + 0.5) - 2;
        // 偶数加零奇数加一
        int row = (int) line / 2 + (int) line % 2 -2;
        for (int i = 0; i < line; i++) {
            System.out.print(str);
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.print(str);
            for (int j = 0; j < line - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(str);
        }
        for (int i = 0; i < line; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

}
