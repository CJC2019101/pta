package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author JianfeiChen
 * @date 2020/7/25 10:20
 * @Description 查验身份证 (15分)
 */
public class Pat_1031 {

    // 权值
    private static int[] weight = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    // 校验码
    private static char[] m = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};

    public static boolean isValid(String idCard) {
        int res = 0;
        for (int i = 0; i < idCard.length() - 1; i++) {
            // 题目要求：只检查前17位是否全为数字且最后1位校验码计算准确。
            if (idCard.charAt(i) < '0' || idCard.charAt(i) > '9') {
                return false;
            }
            res += weight[i] * ((int) idCard.charAt(i) - '0');
        }
        return idCard.charAt(idCard.length() - 1) == m[res % 11];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        boolean allPass = true;
        String idCard;
        for (int i = 0; i < n; i++) {
            idCard = reader.readLine();
            if (!isValid(idCard)) {
                allPass = false;
                System.out.println(idCard);
            }
        }
        if (allPass) {
            System.out.println("All passed");
        }
    }
}
