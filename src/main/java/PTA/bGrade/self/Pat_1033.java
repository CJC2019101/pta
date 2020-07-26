package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/7/26 10:46
 * @Description 旧键盘打字 (20分)
 */
public class Pat_1033 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String error_code = reader.readLine();
        String answer_print = reader.readLine();
        boolean flag;
        char answer, error;
        StringBuilder res = new StringBuilder();
        if (error_code.contains("+")) {
            answer_print = answer_print.replaceAll("[A-Z]", "");
        }
        for (int i = 0; i < answer_print.length(); i++) {
            flag = true;
            answer = answer_print.charAt(i);
            for (int j = error_code.length() - 1; j >= 0; j--) {
                error = error_code.charAt(j);
                if (answer == error) {
                    flag = false;
                    break;
                } else if (answer >= 'a' && answer <= 'z' && answer == error + 32) { // 这里一定要排除掉非英文字符的可能
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res.append(answer);
            }
        }
        System.out.print(res.toString());
    }

}
