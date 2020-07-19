package PTA.bGrade.self;

import PTA.bGrade.annotation.Description;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author JianfeiChen
 * @date 2020/5/29 21:52
 * @Description 给定 L 为 1→2→3→4→5→6，K 为 3，则输出应该为 3→2→1→6→5→4；
 * 如果 K 为 4，则输出应该为 4→3→2→1→5→6，即最后不到 K 个元素不反转
 */
public class PTA1025 {

    /**
     * 默认集合元素全部遍历
     *
     * @param collection
     */
    public static void traversalCollection(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            throw new RuntimeException("集合数据异常，长度为：" + collection.size());
        }
        traversalCollection(collection, 0, collection.size() - 1);
    }

    /**
     * 指定集合元素范围进行遍历
     *
     * @param collection
     * @param startIndex
     * @param endIndex
     */
    public static void traversalCollection(Collection collection, int startIndex, int endIndex) {
        Iterator iterator = collection.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (index > startIndex) {
                System.out.print(iterator.next());
            }
            index++;
            if (index > endIndex) {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int n;
        int k;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] info = sc.readLine().split(" ");
        n = Integer.parseInt(info[0]);
        k = Integer.parseInt(info[1]);
        String[] data = sc.readLine().split(" ");
        LinkedList<Integer> collection = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            collection.add(Integer.parseInt(data[i]));
        }
        if (collection.size() < k) {
            traversalCollection(collection);
        } else if (collection.size() >= k) {
            for (int i = k; i <= collection.size(); i += k) {
                for (int j = 0; j < k; j++) {
                    System.out.print(collection.get(i - 1 - j));
                }
            }
            int startPoint = collection.size() % k;
            if (startPoint != 0) {
                for (int i = collection.size() - startPoint; i < collection.size(); i++) {
                    System.out.print(collection.get(i));
                }
            }
        }

    }

}
