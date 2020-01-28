package PTA.bGrade.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author JianfeiChen
 * @date 2020/1/7 10:48
 * @Description PTA.self 继续(3n+1)猜想
 */
public class pta1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> callatz = new ArrayList<>(); // 给定的序列
        Set<Integer> keys = new HashSet<>(); // 关键数
        Set<Integer> keyResult = new HashSet<>(); // 记录已经被验证的数
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            callatz.add(sc.nextInt());
            int num = callatz.get(i);
            while (num != 1 && !keyResult.contains(num)) { // 已经验证了的数中不包含num
                keyResult.add(num);
                if (num % 2 == 0) { // 偶数
                    num = num / 2;
                } else { // 奇数
                    num = ((num * 3) + 1) / 2;
                }
            }
            if (num != callatz.get(i) && num != 1) {
                if (keys.contains(num)) {
                    keys.remove(num);
                }
                keys.add(callatz.get(i));
            }
        }
        sc.close();
        Iterator<Integer> keyIterator = keys.iterator();
        List<Integer> sort = new ArrayList<>();
        while (keyIterator.hasNext()) {
            sort.add(keyIterator.next());
        }
        if (sort.size() == 1) {
            System.out.print(sort.get(0));
        } else {
            Collections.sort(sort); // 逆序排序
            for (int i = sort.size() - 1; i >= 0; i--) {
//                System.out.print(sort.get(i) + " ");
                System.out.print(sort.get(i));
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
//            System.out.println(sort.get(sort.size() - 1));
        }

    }
}
