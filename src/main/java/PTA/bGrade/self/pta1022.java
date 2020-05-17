package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/5/15 16:16
 * @Description 输入两个非负 10 进制整数 A 和 B (≤(2的​30次方)​ −1)，输出 A+B 的 D (1<D≤10)进制数
 */
public class pta1022 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] numberStr = sc.readLine().split(" ");
        Integer a = new Integer(numberStr[0]);
        Integer b = new Integer(numberStr[1]);
        Integer d = new Integer(numberStr[2]);
        StringBuilder hexaDecimal = new StringBuilder();
        int sum = a + b;
        if (sum == 0) {
            System.out.println(sum);
            return;
        }
        while (sum >= d) {
            hexaDecimal.append(sum % d);
            sum /= d;
        }
        hexaDecimal.append(sum);
        System.out.println(hexaDecimal.reverse());
    }
}
