package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * @author JianfeiChen
 * @date 2020/8/18 18:53
 * @Description 火星数字 (20分)
 */
public class Pat_1044 {

    private static String[] low_number = {"tret", "jan", "feb", "mar", "apr", "may", "jun",
            "jly", "aug", "sep", "oct", "nov", "dec"};
    private static String[] up_number = {"tret", "tam", "hel", "maa", "huh", "tou", "kes", "hei",
            "elo", "syy", "lok", "mer", "jou"};

    public static boolean isNumber(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static String tanslate(String str) {
        StringBuilder sb = new StringBuilder();
        if (isNumber(str)) {
            int number = Integer.parseInt(str);
            sb.append(low_number[number % 13]).append(" ");
            number /= 13;
            while (number >= 13) {
                sb.append(up_number[number % 13]).append(" ");
                number /= 13;
            }
            if (number != 0) {
                sb.append(up_number[number]).append(" ");
            }
            String[] split_array = sb.toString().trim().split(" ");
            sb.setLength(0);
            for (int i = split_array.length - 1; i >= 0; i--) {
                sb.append(split_array[i]).append(" ");
            }
        } else {
            String[] splitStrs = str.split(" ");
            String lowStr = splitStrs[splitStrs.length - 1];
            int res = 0;
            boolean flag = true;
            for (int i = 0; i < splitStrs.length - 1; i++) {
                for (int j = 0; j < up_number.length; j++) {
                    if (splitStrs[i].equals(up_number[j])) {
                        res = (int) (res + (j * Math.pow(13, splitStrs.length - i - 1)));
                        break;
                    }
                }
            }
            for (int j = 0; j < low_number.length; j++) {
                if (lowStr.equals(low_number[j])) {
                    res = res + j;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int j = 0; j < up_number.length; j++) {
                    if (lowStr.equals(up_number[j])) {
                        res = res + (j * 13);
                        break;
                    }
                }
            }
            sb.append(res);
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(reader.readLine());
        String[] tanslate_arrayStr = new String[n];
        for (int i = 0; i < n; i++) {
            tanslate_arrayStr[i] = tanslate(reader.readLine());
        }
        for (String s : tanslate_arrayStr) {
            System.out.println(s);
        }
    }

}
