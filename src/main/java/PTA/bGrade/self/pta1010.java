package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/1 10:08
 * @Description 设计函数求一元多项式的导数。
 */
public class pta1010 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean bool = false;
        int zs; // 指数
        int xs; // 系数
        while (reader.hasNext()) {
            zs = reader.nextInt();
            xs = reader.nextInt();
            if (zs * xs != 0) {
                if (bool){
                    System.out.print(" ");
                }else {
                    bool=true;
                }
                System.out.print(zs * xs + " " + (xs - 1));
            }
        }
        reader.close();   //关闭扫描器
        if (!bool) {
            System.out.print("0 0");
        }
    }
}
