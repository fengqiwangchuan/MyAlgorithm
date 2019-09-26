package leetcode.fibonacci_sequence_pow;

public class Solution {
    public static double myPow1(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
            return myPow1(x, n) * x;
        } else if (n == 0) {
            return 1;
        } else {
            if (n == 1) {
                return x;
            }
            n--;
            return myPow1(x, n) * x;
        }
    }

    public static double myPow2(double x, int n) {
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }
        if (n < 0 && n != Integer.MIN_VALUE) {
            return 1.0 / myPow(x, -n);
        } else if (n == 0) {
            return 1.0;
        } else if (n == Integer.MIN_VALUE) {
            //            倒数 2147483648 > 2147483647
            return 1.0 / (myPow(x, (-n) / 2) * myPow(x, (-n) / 2));
        } else if (n % 2 == 1) {
            //            n为奇数 比如 2^5 = 2^(2+2+1)
            return myPow(x, (n - 1) / 2) * myPow(x, (n - 1) / 2) * x;
        } else {
            return myPow(x, n / 2) * myPow(x, n / 2);
        }
    }

    public static double myPow(double x, int n) {
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
//            将 Integer.MIN_VALUE 放在一起考虑
            return ((1 / x) * myPow(1 / x, -(n + 1)));
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = Integer.MIN_VALUE;
        double x = 0.001;
        System.out.println(myPow(x, n));
//        for (int i = 1; i <= n; i++) {
//            System.out.print(fib(i)+" ");
//        }
    }
}
