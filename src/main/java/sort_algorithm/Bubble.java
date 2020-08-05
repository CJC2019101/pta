package sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/18 0:14
 * @Description sort_algorithm：冒泡算法(Bubble Method)
 */
public class Bubble {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
//        array = sort(array);
        array = anwserSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        return array;
    }

    public static int[] anwserSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j+ 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }
        return array;
    }
}
