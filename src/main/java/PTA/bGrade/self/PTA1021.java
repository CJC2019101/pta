package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author JianfeiChen
 * @date 2020/4/27 16:11
 * @Description 给定 N=100311，则有 2 个 0，3 个 1，和 1 个 3。
 */
public class PTA1021 {

    public static int calcNumber(char ch) {
        return ch - '0';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(reader.readLine());
        char[] numbers = n.toString().toCharArray();
        int[] severalNumber = new int[10];
        for (char ch : numbers) {
            severalNumber[calcNumber(ch)]++;
        }
        for (int i = 0; i < severalNumber.length; i++) {
            if (severalNumber[i] != 0) {
                System.out.println(i + ":" + severalNumber[i]);
            }
        }
    }
}
