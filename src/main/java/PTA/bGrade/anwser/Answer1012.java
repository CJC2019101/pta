package PTA.bGrade.anwser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/1 15:54
 * @Description PTA.bGrade.anwser
 */
public class Answer1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < time; i++) {
            list.add(scanner.nextInt());
        }
        //  System.out.println(list);
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        double A4 = 0;
        int A5 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        boolean jiajian = false;
        boolean jishu = true;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i) % 5;
            //  System.out.println(num);
            switch (num) {
                case 0:
                    if (list.get(i) % 2 == 0) {
                        A1 += list.get(i);
                        //    System.out.println(A1);
                        num1++;
                    }
                    break;
                case 1:
                    if (!jiajian) {
                        A2 = A2 + list.get(i);
                        jiajian = true;
                        num2++;
                    } else {
                        A2 = A2 - list.get(i);
                        num2++;
                        jiajian = false;
                    }
                    break;
                case 2:
                    A3++;
                    num3++;
                    break;
                case 3:
                    A4 += list.get(i);
                    num4++;
                    break;
                case 4:
                    if (jishu) {
                        A5 = list.get(i);
                        jishu = false;
                        num5++;
                    } else {
                        if (A5 < list.get(i)) {
                            A5 = list.get(i);
                            num5++;
                        }
                    }
                    break;
            }
        }
        init(A1, num1);
        init(A2, num2);
        init(A3, num3);
        if (num4 != 0) {
            String res = String.format("%.1f", A4 / num4);
            System.out.print(res + " ");
        } else {
            System.out.print("N ");
        }
        if (num5 != 0) {
            System.out.print(A5);
        } else {
            System.out.print("N");
        }

    }

    static void init(int x, int y) {
        if (y != 0) {
            System.out.print(x + " ");
        } else {
            System.out.print("N ");
        }

    }


}
