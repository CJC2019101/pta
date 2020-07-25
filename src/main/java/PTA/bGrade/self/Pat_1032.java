package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author JianfeiChen
 * @date 2020/7/25 11:26
 * @Description 挖掘机技术哪家强 (20分)
 */
public class Pat_1032 {

    public static void main(String[] args) throws IOException {
        // InputStreamReader, 提交10次没有一次AC
//        StreamTokenizer streamTokenizer = new StreamTokenizer(new InputStreamReader(System.in));
        // BufferedReader，第三次AC
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        streamTokenizer.nextToken();
        int n = (int) streamTokenizer.nval;
        int[] res = new int[n + 1];
        int maxValue;
        int maxIndex = 1;
        int index;
        int indexValue;
        for (int i = 0; i < n; i++) {
            streamTokenizer.nextToken();
            index = (int) streamTokenizer.nval;
            streamTokenizer.nextToken();
            indexValue = (int) streamTokenizer.nval;
            res[index] += indexValue;
        }
        maxValue = res[1];
        for (int i = 2; i <= n; i++) {
            if (maxValue < res[i]) {
                maxIndex = i;
                maxValue = res[i];
            }
        }
        System.out.println(maxIndex + " " + maxValue);
    }

}
