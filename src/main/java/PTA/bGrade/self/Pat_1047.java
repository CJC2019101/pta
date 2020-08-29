package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/8/29 14:46
 * @Description https://pintia.cn/problem-sets/994805260223102976/problems/994805277163896832
 */
public class Pat_1047 {

    public static void main(String[] args) throws IOException {
        int[] grades = new int[1000 + 1];
        StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        tokenizer.nextToken();
        int n = (int) tokenizer.nval;
        int index;
        for (int i = 0; i < n; i++) {
            tokenizer.nextToken();
            index = (int) tokenizer.nval;
            tokenizer.nextToken();
            tokenizer.nextToken();
            grades[index] += (int) tokenizer.nval;
        }
        index = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[index]) {
                index = i;
            }
        }
        System.out.println(index + " " + grades[index]);
    }

}
