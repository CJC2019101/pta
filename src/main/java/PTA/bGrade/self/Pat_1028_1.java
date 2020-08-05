package PTA.bGrade.self;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/7/23 15:27
 * @Description 人口普查 (20分)
 */
public class Pat_1028_1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int people_number = sc.nextInt();
        int valid_number = 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date max = dateFormat.parse("2014/09/06");
        Date min = dateFormat.parse("1814/09/06");
        String[] elder = {"001", "2014/09/06"};
        String[] young = {"001", "1814/09/06"};
        String name;
        String dateStr;
        Date date;
        for (int i = 0; i < people_number; i++) {
            name = sc.next();
            dateStr = sc.next();
            date = dateFormat.parse(dateStr);
            if (max.compareTo(date) >= 0 && min.compareTo(date) <= 0) {
                valid_number++;
                if (date.compareTo(dateFormat.parse(elder[1])) <= 0) {
                    elder[0] = name;
                    elder[1] = dateStr;
                }
                if (date.compareTo(dateFormat.parse(young[1])) >= 0) {
                    young[0] = name;
                    young[1] = dateStr;
                }
            }
        }
        if (valid_number != 0) {
            System.out.println(valid_number + " " + elder[0] + " " + young[0]);
        } else {
            System.out.println(valid_number);
        }
    }
}
