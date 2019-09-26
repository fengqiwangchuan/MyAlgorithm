package lanqiao.黄金连分数;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        // 化为求斐波那契相邻两项的比值,到多少项？越多越精确 n/(n+1)
        // double无法表示100位，BigInteger和BigDecimal
//        BigInteger a = BigInteger.ONE;
//        BigInteger b = BigInteger.ONE;
//        for (int i = 3; i < 200; i++) {
//            BigInteger tmp = b;
//            b = a.add(b);
//            a = tmp;
//        }
//        BigDecimal divide = new BigDecimal(a, 110).divide(new BigDecimal(b, 110), BigDecimal.ROUND_HALF_DOWN);
//        System.out.println(divide.toPlainString().substring(0, 103));
//        System.out.println(divide.toPlainString().substring(0, 103).length());


        String start = new Solution().getClass().getName();
        System.out.println(start);
        int a = 1;
        int b = 1;
        int c = 1;
        int res = 0;
        for (int i = 4; i <= 20190324; i++) {
            res = (a + b + c) % 10000;
            a = b;
            b = c;
            c = res;
        }
        System.out.println(res);
    }
}
