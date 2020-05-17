package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/5/17 16:40
 * @Description PTA：组个最小数
 */
public class PTA1023 {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int minIndex = 0;
        StringBuilder res = new StringBuilder();
        String[] numbersAmount = sc.readLine().split(" ");
        for (int i = 0; i < numbersAmount.length; i++) {
            numbers[i] = Integer.valueOf(numbersAmount[i]);
        }
        if (numbers[0] != 0) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] != 0) {
                    numbers[i]--;
                    res.append(i);
                    break;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i]; j++) {
                res.append(i);
            }
        }
        System.out.println("res = " + res);
    }
}
