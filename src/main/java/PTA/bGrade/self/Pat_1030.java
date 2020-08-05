package PTA.bGrade.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/24 10:38
 * @Description 完美数列 (25分)
 */
public class Pat_1030 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        long mp;
        int valid_number = 0;
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
//            int 乘 int结果先int再转换为long
            mp = (long) array.get(i) * (long) p;
//            for (int j = array.size() - 1; j >= i; j--) {
//                if (mp >= array.get(j)) {
//                    if (valid_number < (j - i + 1)) {
//                        valid_number = (j - i + 1);
//                    }
//                    break;
//                }
//            }
            for (int j = i + valid_number; j < array.size(); j++) {
                if (mp < array.get(j)) {
                    if (valid_number < (j - i)) {
                        valid_number = (j - i);
                    }
                    break;
                } else if ((j == array.size() - 1) && (valid_number < (j - i + 1))) {
                    valid_number = (j - i + 1);
                }
            }
        }
        System.out.println(valid_number);
    }
}
