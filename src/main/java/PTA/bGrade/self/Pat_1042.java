package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/8/5 11:06
 * @Description PTA.bGrade.self
 */
public class Pat_1042 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().toLowerCase();
        int[] char_count = new int[26];
        int max_index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                char_count[ch - 97]++;
            }
        }
        for (int i = 1; i < 26; i++) {
            if (char_count[max_index] < char_count[i]) {
                max_index = i;
            }
        }
        System.out.println((char) (max_index + 97) + " " + char_count[max_index]);
    }

}
