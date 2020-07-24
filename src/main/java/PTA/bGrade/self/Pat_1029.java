package PTA.bGrade.self;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author JianfeiChen
 * @date 2020/7/24 9:24
 * @Description 旧键盘 (20分)
 */
public class Pat_1029 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalStr = sc.next().toUpperCase();
        String errorStr = sc.next().toUpperCase();
        Set<String> record = new LinkedHashSet<>();
        for (int original_index = 0; original_index < originalStr.length(); original_index++) {
            if (!errorStr.contains(originalStr.charAt(original_index) + "")) {
                record.add(originalStr.charAt(original_index) + "");
            }
        }
        for (String s : record) {
            System.out.print(s);
        }
        System.out.println();
    }

}
