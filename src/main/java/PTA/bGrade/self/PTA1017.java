package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/4/12 12:35
 * @Description 本题要求计算 A/B，其中 A 是不超过 1000 位的正整数，B 是 1 位正整数。你需要输出商数 Q 和余数 R，使得 A=B×Q+R 成立。
 */
public class PTA1017 {

    public static void main(String[] args) {
        String a;
        int b;
        StringBuilder q = new StringBuilder();
        int r = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.nextInt();
        int index = 2;
        int indexVariable;
        while (true) {
            indexVariable = 2;
            if (a.charAt(index) == '0') {
                index++;
                indexVariable++;
            }
            q.append((Integer.valueOf(r + a.substring(index - indexVariable, index)) / b));
            r = Integer.valueOf(r + a.substring(index - indexVariable, index)) % b;
            index += 2;
            if ((index > (a.length()))) {
                if (((index - 1) == (a.length()))) {
                    q.append((Integer.valueOf(r + a.substring(a.length() - 1))) / b);
                    r = Integer.valueOf(r + a.substring(a.length() - 1)) % b;
                }
                break;
            }
        }
        System.out.println(q.toString() + " " + r);
    }
}
