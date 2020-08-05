package PTA.bGrade.self;

import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/23 16:50
 * @Description 人口普查 (20分)第二种解法
 */
public class Pat_1028_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people_number = sc.nextInt();
        int valid_number = 0;
        String[] elder = {"001", "2014/09/06"};
        String[] young = {"001", "1814/09/06"};
        String name;
        String dateStr;
        for (int i = 0; i < people_number; i++) {
            name = sc.next();
            dateStr = sc.next();
            if (dateStr.compareTo("2014/09/06") <= 0 && dateStr.compareTo("1814/09/06") >= 0) {
                valid_number++;
                if (elder[1].compareTo(dateStr) >= 0) {
                    elder[0] = name;
                    elder[1] = dateStr;
                }
                if (young[1].compareTo(dateStr) <= 0) {
                    young[0] = name;
                    young[1] = dateStr;
                }
            }
        }
        if (valid_number>0){
            System.out.println(valid_number + " " + elder[0] + " " + young[0]);
        }else {
            System.out.println(valid_number);
        }
    }

}
