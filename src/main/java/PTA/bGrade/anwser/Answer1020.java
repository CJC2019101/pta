package PTA.bGrade.anwser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author JianfeiChen
 * @date 2020/4/27 11:38
 * @Description PTA.bGrade.anwser
 */
public class Answer1020 {
    static class Cake implements Comparable<Cake> {
        double amount;
        double price;
        double value;

        public Cake(double amount, double price, double value) {
            this.amount = amount;
            this.price = price;
            this.value = value;
        }

        @Override
        public int compareTo(Cake o) {
            return value > o.value ? -1 : 1;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int d = Integer.parseInt(in[1]);

        ArrayList<Cake> list = new ArrayList<Cake>();
        String[] w = br.readLine().split(" "), pr = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            double m = Double.parseDouble(w[i]);
            double p = Double.parseDouble(pr[i]);
            double value = p / m;
            list.add(new Cake(m, p, value));
        }

        Collections.sort(list);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (d > list.get(i).amount) {
                sum += list.get(i).price;
            } else {
                sum += list.get(i).value * d;
                break;
            }
            d -= list.get(i).amount;
        }
        System.out.println(String.format("%.2f", sum));
    }
}

