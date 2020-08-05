package PTA.bGrade.self;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2019/12/31 10:51
 */
public class Pat_1002 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Long n = reader.nextLong();
        int sum = 0;
        int[] array;
        StringBuffer str = new StringBuffer();
        array = sumDigital(n);
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0)
                sum += array[i];
        }
        array = sumDigital((long) sum);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                switch (array[i]) {
                    case 1:
                        str.append("yi ");
                        break;
                    case 2:
                        str.append("er ");
                        break;
                    case 3:
                        str.append("san ");
                        break;
                    case 4:
                        str.append("si ");
                        break;
                    case 5:
                        str.append("wu ");
                        break;
                    case 6:
                        str.append("liu ");
                        break;
                    case 7:
                        str.append("qi ");
                        break;
                    case 8:
                        str.append("ba ");
                        break;
                    case 9:
                        str.append("jiu ");
                        break;
                    case 0:
                        str.append("ling ");
                        break;
                }
            }
        }
        System.out.print(str.toString().trim());
    }

    public static int[] sumDigital(Long digital) {
        int mi = 100;
        int[] wei = new int[102];
        int index = 0;
        boolean flag = false;
        Arrays.fill(wei, -1);
        if (digital < 10) {
            wei[0] = Math.toIntExact(digital);
            return wei;
        }
        while (digital > 10 && mi >= 0) {
            if ((int) (digital / (Math.pow(10, mi)) % 10) != 0)
                flag = true;
            if (flag)
                wei[index++] = (int) (digital / (Math.pow(10, mi)) % 10);
            mi--;
        }
        return wei;
    }
}
