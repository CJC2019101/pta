package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author JianfeiChen
 * @date 2020/4/18 16:00
 * @Description 给定任一个各位数字不完全相同的 4 位正整数，如果我们先把 4 个数字按非递增排序，
 * 再按非递减排序，然后用第 1 个数字减第 2 个数字，将得到一个新的数字。一直重复这样做，我们很快会停在有
 * “数字黑洞”之称的 6174，这个神奇的数字也叫 Kaprekar 常数。
 */
public class PTA1019 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder util = new StringBuilder(); //对数组升序、降序的中间变量
        Integer desc; // 降序数
        Integer asc; // 升序数
        int result; // 计算结果
        int[] numbers = new int[4];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = input.charAt(i) - 48;
        }
        while (true) {
//            numbers = input.toCharArray();
            Arrays.sort(numbers);
//            util.setLength(0);
//            util.append(Arrays.toString(numbers));
//            util.reverse();
            asc = Integer.parseInt(Arrays.toString(numbers).replaceAll("\\[|\\]|,|\\s", ""));
            desc = Integer.parseInt(Arrays.toString(jiangxu(numbers)).replaceAll("\\[|\\]|,|\\s", ""));
            result = desc - asc;
            input = Integer.toString(result);
            for (int i = 0; i < input.length(); i++) {
                numbers[i] = input.charAt(i) - 48;
            }
            if (result != 6174 && result != 0) {
                System.out.printf("%04d - %04d = %04d\n", desc, asc, result);
            } else {
                System.out.printf("%04d - %04d = %04d", desc, asc, result);
            }
            if (input.equals("0") || input.equals("6174")) {
                break;
            }
        }
    }

    //降序
    static int[] jiangxu(int[] arr) {
        int temp;
        int n = arr.length - 1;
        for (int i = 0; i <= (n >> 1); i++) {
            temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }
        return arr;
    }
}
