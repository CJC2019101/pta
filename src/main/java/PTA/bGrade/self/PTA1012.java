package PTA.bGrade.self;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author JianfeiChen
 * @date 2020/3/1 13:52
 * @Description 对整数分类
 */
public class PTA1012 {

    public static class Number {
        private int number;

        public Number(int number) {
            this.number = number;
        }

        @Override
        public int hashCode() {
            if (this.number % 5 == 0) {
                return 1; // A1
            } else if (this.number % 5 == 1) {
                return 2; // A2
            } else if (this.number % 5 == 2) {
                return 3; // A3
            } else if (this.number % 5 == 3) {
                return 4; // A4
            } else {
                return 5; // A5
            }
        }

        public static float calc(int hashCode, List<Number> list) {
            float value = 0;
            int index = 0;
            if (list != null && list.size() > 0) {
                for (Number n : list) {
                    index++;
                    if (hashCode == 1 && n.number % 2 == 0) {
                        value += n.number;
                    } else if (hashCode == 2) {
                        if (index % 2 == 1) {
                            value += n.number;
                        } else {
                            value -= n.number;
                        }
                    } else if (hashCode == 3) {
                        value = list.size();
                        break;
                    } else if (hashCode == 4) {
                        value += n.number;
                    } else if (hashCode == 5) {
                        if (value < n.number) {
                            value = n.number;
                        }
                    }
                }
                if (hashCode == 4) {
                    value /= list.size();
                }
            }
            return value;
        }
    }

    public static void outPut(int i, boolean space) {
        if (i == 0) {
            if (space) {
                System.out.print("N ");
            } else {
                System.out.print("N");
            }
        } else {
            if (space) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Map<Integer, List<Number>> results = new HashMap<>();
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int number = reader.nextInt();
            List<Number> numbersList = new ArrayList<>();
            Number result = new Number(number);
            if (!results.containsKey(result.hashCode())) {
                numbersList.add(result);
                results.put(result.hashCode(), numbersList);
            } else {
                numbersList = results.get(result.hashCode());
                numbersList.add(result);
                results.put(result.hashCode(), numbersList);
            }
        }
        int a1 = (int) Number.calc(1, results.get(1));
        int a2 = (int) Number.calc(2, results.get(2));
        int a3 = (int) Number.calc(3, results.get(3));
        float a4 = Number.calc(4, results.get(4));
        int a5 = (int) Number.calc(5, results.get(5));

        outPut(a1, true);
        outPut(a2, true);
        outPut(a3, true);
        if (a4 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(String.format("%.1f", a4) + " ");
        }
        outPut(a5, false);
        System.out.println();
        reader.close();
    }

}
