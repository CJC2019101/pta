package PTA.bGrade.self;

import PTA.bGrade.annotation.Description;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JianfeiChen
 * @date 2020/4/20 18:08
 * @Description 规划最大月饼销售额策略
 */
public class PTA1020 {

    @Description(desc = "月饼类")
    static class MoonCake implements Comparable<MoonCake> {
        Double price; // 元/吨
        @Description(desc = "单位为万吨，1.5万吨等于15000吨")
        // 使用BigDecimal最后一个测试用例不能通过。创建BigDecimal太过于消耗时间
                Double account;

        public MoonCake(Double price, Double account) {
            this.price = price;
            this.account = account;
        }

        // 全部的销售额
        public double totalMoney() {
            return price * account;
        }

        // 部分的销售额
        public double totalMoney(double count) {
            return price * count;
        }

        @Override
        public int compareTo(MoonCake other) {
            int res = this.price.compareTo(other.price);
            return Integer.compare(res, 0);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] moonCakeInfo = reader.readLine().split(" ");
        String[] moonCakeCounts = reader.readLine().split(" ");
        String[] moonCakePrices = reader.readLine().split(" ");
        int n = Integer.parseInt(moonCakeInfo[0]); //月饼类别数
        double need = Double.parseDouble(moonCakeInfo[1]); // 需求量
        double count;
        double price;
        double money = 0; // 总利润
        if (need == 0) {
            System.out.println("0.00");
            return;
        }
        List<MoonCake> moonCakes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            price = Double.parseDouble(moonCakePrices[i]);
            count = Double.parseDouble(moonCakeCounts[i]);
            moonCakes.add(new MoonCake(price / count, count));
        }
        Collections.sort(moonCakes);
        for (int i = moonCakes.size() - 1; i >= 0; i--) {
            if (need > moonCakes.get(i).account) {
                money += moonCakes.get(i).totalMoney();
            } else {
                money += moonCakes.get(i).totalMoney(need);
                break;
            }
            need -= moonCakes.get(i).account;
        }
        System.out.printf("%.2f\n", money);
    }
}
