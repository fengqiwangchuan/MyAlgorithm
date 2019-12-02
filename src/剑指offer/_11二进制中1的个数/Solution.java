package 剑指offer._11二进制中1的个数;

/**
 * 输入一个整数，
 * 输出该数二进制表示中1的个数。
 * 其中负数用补码表示。
 */
public class Solution {
//    public int NumberOf1(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        int count = 0;
//        char[] ch = Integer.toBinaryString(n).toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] == '1') {
//                count++;
//            }
//        }
//        return count;
//    }

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(new Solution().NumberOf1(-10));

    }
}
