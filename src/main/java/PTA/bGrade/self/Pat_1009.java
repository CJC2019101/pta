package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/1 9:38
 * @Description 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 */
public class Pat_1009 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String words = reader.nextLine();
        String[] word = words.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
            if (i!=0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
