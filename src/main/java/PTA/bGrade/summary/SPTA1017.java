package PTA.bGrade.summary;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author JianfeiChen
 * @date 2020/4/13 8:59
 * @Description PTA.bGrade.anwser
 */
public class SPTA1017 {

    public static void main(String[] args) {
        Double d = new Double("0.06");
        BigDecimal big_d = BigDecimal.valueOf(d);
        BigDecimal big_d2 = new BigDecimal("0.06");
        BigDecimal big_d3 = new BigDecimal(0.06);
        BigDecimal round = big_d3.round(new MathContext(10,RoundingMode.HALF_UP));
        System.out.println("d = " + d);
        System.out.println("d.toString() = " + d.toString());
        System.out.println("big_d = " + big_d);
        System.out.println("big_d2 = " + big_d2);
        System.out.println("big_d3 = " + big_d3);
        System.out.println("over");
    }
}
