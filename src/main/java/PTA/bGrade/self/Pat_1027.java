package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/21 21:23
 * @Description 打印沙漏 (20分)
 */
public class Pat_1027 {

    @Deprecated
    // 可以采用等差数列求和的方式直接算出沙漏的层数
    public static String calc(int char_sum) {
        // 沙漏层数
        int flow_number = 0;
        int number = 3;
        // 符号总数
        int number_sum = 0;
        for (int i = 0; i < 100; i++) {
            if (number + number_sum >= char_sum) {
                break;
            } else {
                number_sum += number;
                number += 2;
                flow_number++;
            }
        }
        return flow_number + "&" + number_sum;
    }

    public static int getFlow(int char_sum) {
        int row = 0;
        // 等差数列求和方式：(首项+末项) x (项数/2) -----> (A1+An) x (n/2)
        for (int i = 1; (i + 2) * i <= char_sum; i++) {
            row++;
        }
        return row;
    }

    public static void main(String[] args) {
        int char_sum;
        char ch;
        Scanner sc = new Scanner(System.in);
        char_sum = sc.nextInt();
        ch = sc.next().charAt(0);
        // 求得沙漏一半的层数
        String[] infos = calc((char_sum - 1) / 2).split("&");
        int n = Integer.valueOf(infos[0]);
        for (int i = n; i >= 1; i--) {
            // 打印空格
            for (int spaceNum = 1; spaceNum <= n - i; spaceNum++) {
                System.out.print(" ");
            }
            // 打印符号
            for (int j = 0; j < 1 + (2 * i); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        // 打印中间行空格
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        // 打印下层沙漏
        System.out.println(ch);
        for (int i = 1; i <= n; i++) {
            // 打印空格
            for (int spaceNum = n - i; spaceNum > 0; spaceNum--) {
                System.out.print(" ");
            }
            // 打印符号
            for (int j = 0; j < 1 + (2 * i); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        int flow = getFlow((char_sum - 1) / 2);
        int remain = ((((3 + (flow * 2) + 1) * flow) / 2) * 2) + 1;
        System.out.println("remain = " + (char_sum - remain));
        System.out.println(char_sum - (Integer.valueOf(infos[1]) * 2) - 1);

    }
}
