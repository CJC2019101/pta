package PTA.bGrade.anwser;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/1 10:37
 * @Description PTA.bGrade.anwser
 */
public class Answer1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = false;

        //hasNext();判断是否有下一组
        while (sc.hasNext()) {
            int coef = sc.nextInt();   //系数
            int expon = sc.nextInt();  //指数

            //判断是否为0的指数
            if (coef * expon != 0) {
                //if语句括号中的式子应该是判断式，判断为ture才会执行。
                //不是相等执行
                if (bool) {
                    System.out.print(" ");
                } else {
                    bool = true;
                }
                System.out.print(coef * expon + " " + (expon - 1));
            }
        }
        sc.close();   //关闭扫描器
        if (!bool) {
            System.out.print("0 0");
        }
    }
}
