package PTA.anwser;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2019/12/31 13:38
 */
public class Answer1002 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String num = reader.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        String anwser = sum + "";
        for (int i = 0; i < anwser.length(); i++) {
            switch (anwser.charAt(i)) {
                case '1':
                    System.out.print("yi");
                    break;
                case '2':
                    System.out.print("er");
                    break;
                case '3':
                    System.out.print("san");
                    break;
                case '4':
                    System.out.print("si");
                    break;
                case '5':
                    System.out.print("wu");
                    break;
                case '6':
                    System.out.print("liu");
                    break;
                case '7':
                    System.out.print("qi");
                    break;
                case '8':
                    System.out.print("ba");
                    break;
                case '9':
                    System.out.print("jiu");
                    break;
                case '0':
                    System.out.print("ling");
                    break;
            }
            if (i != anwser.length() - 1)
                System.out.print(" ");
        }
    }
}
