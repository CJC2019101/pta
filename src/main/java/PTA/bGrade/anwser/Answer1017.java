package PTA.bGrade.anwser;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/4/12 21:44
 * @Description PTA.bGrade.anwser
 */
public class Answer1017 {
    public static void main(String[] args) {
        String a;
        String b;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        BigInteger int_a = new BigInteger(a);
        BigInteger int_b = new BigInteger(b);
        BigInteger divide = int_a.divide(int_b); // 商
        BigInteger remainder = int_a.remainder(int_b); // remainder余数
        System.out.println(divide+" "+remainder);
    }
}
