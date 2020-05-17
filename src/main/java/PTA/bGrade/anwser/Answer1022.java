package PTA.bGrade.anwser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author JianfeiChen
 * @date 2020/5/17 23:17
 * @Description PTA.bGrade.anwser
 */
public class Answer1022 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = sc.readLine().split(" ");
        BigInteger a = new BigInteger(inputData[0]);
        BigInteger b = new BigInteger(inputData[1]);
        int d = new Integer(inputData[2]);
        int res = a.add(b).intValue();
        System.out.println(Integer.toString(res, d));
    }
}
