package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/29 20:55
 * @Description 在霍格沃茨找零钱 (20分)
 */
public class Pat_1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] should_pay = sc.next().split("\\.");
        String[] real_pay = sc.next().split("\\.");
        long should_res, real_res;
        should_res = Integer.valueOf(should_pay[0]) * 17 * 29 + Integer.valueOf(should_pay[1]) * 29 + Integer.valueOf(should_pay[2]);
        real_res = Integer.valueOf(real_pay[0]) * 17 * 29 + Integer.valueOf(real_pay[1]) * 29 + Integer.valueOf(real_pay[2]);
        real_res -= should_res;
        System.out.println(real_res / (17 * 29) + "." + Math.abs((real_res % (17 * 29)) / (29)) + "." + Math.abs(real_res % 29));
    }

}
