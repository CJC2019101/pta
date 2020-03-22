package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/14 21:08
 * @Description 福尔摩斯的约会
 */
public class PTA1014 {
    public static class PTA1014ParamCode {
        public static int day = 0;
        public static int hour = 1;
        public static int minute = 2;
    }

    public static int timeNumber(String str1, String str2, int paramCode) {
        int result = 0;
        int index = 0;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            boolean isEqual = (str2.charAt(i) == str1.charAt(i)); // 是否相等、
            boolean isUpperCase = Character.isUpperCase(str1.charAt(i)); // 是否是大写字母
            boolean isNumber = Character.isDigit(str1.charAt(i)); // 是否是数字
            if (isEqual && (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'G') && (paramCode == 0)) {// day
                result = str1.charAt(i) - 'A';
                break;
            } else {
                if ((paramCode == 1) && isEqual) { // hour
                    if ((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'G') && (index == 0)) {
                        index++;
                    } else if ((index != 0) && ((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'N') || isNumber)) {
                        index++;
                    }
                    if (index == 2) {
                        if (isNumber) {
                            result = str1.charAt(i) - '0';
                        } else {
                            result = Math.abs(str1.charAt(i) - 'A') + 10;
                        }
                        break;
                    }
                } else if ((paramCode == 2) && (str1.charAt(i) == str2.charAt(i)) && (isUpperCase || Character.isLowerCase(str1.charAt(i)))) { // minute
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[4];
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.next();
        }
        int day = timeNumber(strings[1], strings[0], PTA1014ParamCode.day);
        int hour = timeNumber(strings[1], strings[0], PTA1014ParamCode.hour);
        int minute = timeNumber(strings[2], strings[3], PTA1014ParamCode.minute);
        System.out.print(week[day] + " ");
        System.out.printf("%02d:", hour);
        System.out.printf("%02d", minute);
    }
}
