package PTA.bGrade.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author JianfeiChen
 * @date 2020/5/21 9:58
 * @Description PTA.bGrade.self
 */
public class Pat_1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = sc.readLine().split("[e,E]");
        BigDecimal jiShu = new BigDecimal(numbers[0]);
        BigInteger zhiShu = new BigInteger(numbers[1]);
        Double pow = Math.pow(10d, zhiShu.doubleValue());
        BigDecimal res = jiShu.multiply(new BigDecimal(pow.toString()));
        // toPlainString()输出不使用任何指数，即12000 ：12000而不是1.2*10^4
        System.out.println(res.toPlainString());
    }
}
