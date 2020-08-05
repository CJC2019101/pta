package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/8/4 10:52
 * @Description 到底买不买 (20分)
 */
public class Pat_1039 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int colorBall[] = new int[75];
        int needBall[] = new int[75];
        String ballStr = reader.readLine();
        String needStr = reader.readLine();
        calc(colorBall, ballStr);
        calc(needBall, needStr);
        int totalNum = 0;
        boolean flag = true;
        for (int i = 0; i < 75; i++) {
            if (needBall[i] > colorBall[i]) {
                if (flag) {
                    flag = false;
                }
                totalNum += (needBall[i] - colorBall[i]);
            }
        }
        if (flag) {
            System.out.println("Yes " + (ballStr.length() - needStr.length()));
        } else {
            System.out.println("No " + totalNum);
        }
    }

    public static void calc(int[] color_ball, String ball) {
        for (int i = 0; i < ball.length(); i++) {
            color_ball[(int) (ball.charAt(i) - 48)]++;
        }
    }


}
