package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author JianfeiChen
 * @date 2020/8/17 18:37
 * @Description 输出PATest (20分)
 */
public class Pat_1043 {

    public static void main(String[] args) throws IOException {
        StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        tokenizer.nextToken();
        String str = tokenizer.sval;
        int num_P, num_A, num_T, num_e, num_s, num_t;
        num_P = num_A = num_T = num_e = num_s = num_t = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            switch (ch) {
                case 'P':
                    num_P++;
                    break;
                case 'A':
                    num_A++;
                    break;
                case 'T':
                    num_T++;
                    break;
                case 'e':
                    num_e++;
                    break;
                case 's':
                    num_s++;
                    break;
                case 't':
                    num_t++;
                    break;
            }
        }
        while (true) {
            if (num_P > 0) {
                System.out.print('P');
                num_P--;
            }
            if (num_A > 0) {
                System.out.print('A');
                num_A--;
            }
            if (num_T > 0) {
                System.out.print('T');
                num_T--;
            }
            if (num_e > 0) {
                System.out.print('e');
                num_e--;
            }
            if (num_s > 0) {
                System.out.print('s');
                num_s--;
            }
            if (num_t > 0) {
                System.out.print('t');
                num_t--;
            }
            if (num_A <= 0 && num_P <= 0 && num_T <= 0 && num_e <= 0 && num_s <= 0 && num_t <= 0) {
                System.out.println();
                break;
            }
        } // switch
    }

}
