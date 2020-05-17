package PTA.bGrade.anwser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/5/17 23:35
 * @Description PTA.bGrade.anwser
 */
public class Answer1023 {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        String[] numbersAmount = sc.readLine().split(" ");
        for (int i = 0; i < numbersAmount.length; i++) {
            numbers[i] = Integer.valueOf(numbersAmount[i]);
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(i);
                numbers[i]--;
                if (numbers[i]!=0){
                    i--;
                }
                while (numbers[0] != 0) {
                    System.out.print(0);
                    numbers[0]--;
                }
            }

        }
    }

}
