package PTA.bGrade.anwser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/4/18 15:33
 * @Description PTA.bGrade.anwser
 */
public class Answer1018 {
    static int[] j = new int[3];//"B","C","J" 212
    static int[] y = new int[3];//002
    static String[] res = {"B", "C", "J"};

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(buf.readLine());
        //System.out.println(time+"*");
        int l = 0;//甲赢
        int w = 0;//乙赢
        int balence = 0;
        for (int i = 0; i < time; i++) {
            char[] ch = buf.readLine().toCharArray();
            char jia = ch[0];
            char yi = ch[2];
            //甲乙胜利的情况
            if (jia == 'C' && yi == 'J' || jia == 'J' && yi == 'B' || jia == 'B' && yi == 'C') {
                l++;
                if (jia == 'B') {
                    j[0]++;
                }
                if (jia == 'C') {
                    j[1]++;
                }
                if (jia == 'J') {
                    j[2]++;
                }
            } else if (jia == 'J' && yi == 'C' || jia == 'B' && yi == 'J' || jia == 'C' && yi == 'B') {
                w++;
                if (yi == 'B') {
                    y[0]++;
                }
                if (yi == 'C') {
                    y[1]++;
                }
                if (yi == 'J') {
                    y[2]++;
                }
            } else balence++;
        }
        System.out.println(l + " " + balence + " " + w);
        System.out.println(w + " " + balence + " " + l);
        int maxj = 0;
        int maxy = 0;
        //找胜利最多的手势
        for (int i = 1; i < 3; i++) {
            if (j[i] > j[maxj]) {
                maxj = i;
            }
        }
        for (int i = 1; i < 3; ++i) {
            if (y[i] > y[maxy]) {
                maxy = i;
            }
        }
        System.out.println(res[maxj] + " " + res[maxy]);
        buf.close();
    }


}
