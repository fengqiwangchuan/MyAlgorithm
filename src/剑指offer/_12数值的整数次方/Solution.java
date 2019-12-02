package 剑指offer._12数值的整数次方;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */
public class Solution {
    //    public double Power(double base, int exponent) {
//        double res = 1;
//        if (exponent > 0) {
//            for (int i = 0; i < exponent; i++) {
//                res *= base;
//            }
//        }
//        if (exponent < 0) {
//            base = 1 / base;
//            for (int i = 0; i < -exponent; i++) {
//                res *= base;
//            }
//        }
//        return res;
//    }

    /**
     * 快速幂
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        double res = 1;
        int ex = exponent;
        if (exponent < 0) {
            ex = -exponent;
        }
        while (ex != 0) {
            if ((ex & 1) == 1) {
                res *= base;
            }
            base *= base;
            ex >>= 1;
        }
        return exponent > 0 ? res : (1 / res);
    }
}
