package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JianfeiChen
 * @date 2020/8/28 16:28
 * @Description https://pintia.cn/problem-sets/994805260223102976/problems/994805278589960192
 */
public class Pat_1045 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        tokenizer.nextToken();
        int n = (int) tokenizer.nval;
        int array_a[] = new int[n];
        int array_b[] = new int[n];
        List<Integer> core = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tokenizer.nextToken();
            array_a[i] = (int) tokenizer.nval;
            array_b[i] = array_a[i];
        }
        for (int i = 0; i < n; i++) {
            Arrays.sort(array_a);
            if (array_a[i] == array_b[i]) {
                core.add(array_a[i]);
            }
        }
        System.out.println(core.size());
        for (int i = 0; i < core.size() - 1; i++) {
            System.out.print(core.get(i) + " ");
        }
        System.out.println(core.get(core.size() - 1));
    }

}
