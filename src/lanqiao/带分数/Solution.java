package lanqiao.带分数;

import java.util.Scanner;

public class Solution {
    //    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int ans;

    public static void main(String[] args) {
//        全排列
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        f(arr, 0);
    }

    //        确认某一个排列的第k位
    private static void f(int[] arr, int k) {
        if (k == 9) {
//            if (check(arr)) {
//                ans++;
//            }
            pr(arr);
        }
        for (int i = k; i < arr.length; i++) {
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

//        选定第k位
            f(arr, k + 1);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

        }
    }

    private static void pr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    private static boolean check(int[] arr) {

        return false;
    }
}
