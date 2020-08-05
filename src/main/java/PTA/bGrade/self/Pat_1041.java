package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author JianfeiChen
 * @date 2020/8/5 10:39
 * @Description 考试座位号 (15分)
 */
public class Pat_1041 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        tokenizer.nextToken();
        int n = (int) tokenizer.nval;
        String[] chair_info = new String[n + 1];
        StringBuilder sb = new StringBuilder();
        int index;
        int searchNum;
        for (int i = 0; i < n; i++) {
            sb.setLength(20);
            tokenizer.nextToken();
            sb.append((long) tokenizer.nval).append(" ");
            tokenizer.nextToken();
            index = (int) tokenizer.nval;
            tokenizer.nextToken();
            sb.append((int) tokenizer.nval);
            chair_info[index] = sb.toString().trim();
            sb.setLength(0);
        }
        tokenizer.nextToken();
        searchNum = (int) tokenizer.nval;
        for (int i = 0; i < searchNum; i++) {
            tokenizer.nextToken();
            index = (int) tokenizer.nval;
            System.out.println(chair_info[index]);
        }

    }

}
