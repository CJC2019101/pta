package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author JianfeiChen
 * @date 2020/4/20 18:08
 * @Description 规划最大月饼销售额策略
 */
public class PTA1020 {

    // 月饼类
    static class MoonCake implements Comparable<MoonCake> {
        BigDecimal price; // 元/吨
        int account; // 数量

        public MoonCake(BigDecimal price, int account) {
            this.price = price;
            this.account = account;
        }

        // 全部的销售额
        public double totalMoney() {
            return price.doubleValue() * account;
        }

        // 部分的销售额
        public double totalMoney(int count) {
            return price.doubleValue() * count;
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
        int need = Integer.parseInt(moonCakeInfo[1]); // 需求量
        if (need == 0) {
            System.out.println("0.00");
            return;
        }
        List<MoonCake> moonCakes = new ArrayList<>();
        int count;
        double price;
        double money = 0; // 总利润
        for (int i = 0; i < n; i++) {
            price = Double.parseDouble(moonCakePrices[i]);
            count = Integer.parseInt(moonCakeCounts[i]);
            moonCakes.add(new MoonCake(new BigDecimal(price / count), count));
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
