package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/8/5 10:01
 * @Description 有几个PAT (25分)
 */
public class Pat_1040 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String patStr = reader.readLine();
        int count_t = countChar(patStr, 'T');
        int res = 0;
        int count_p = 0;
        for (int i = 0; i < patStr.length(); i++) {
            char ch = patStr.charAt(i);
            if (ch == 'T') {
                count_t--;
            } else if (ch == 'A') {
                res = (count_t * count_p + res)%1000000007;
            } else {
                count_p++;
            }
        }
        System.out.println(res);
    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

}
