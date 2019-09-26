package _360校招._4;

import java.util.Scanner;

public class Main {
    static double l = 0;
    static int n;
    static double tmp = 0;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        getAll(a, 0, n - 1);
        System.out.print(l);

    }

    public static void getAll(int[] array, int start, int end) {
        int v0 = 0;
        if (start == end) {
            for (int i : array) {
                tmp += v0 * arr[i][1] + 0.5 * arr[i][0] * arr[i][1] * arr[i][1];
                v0 += arr[i][0] * arr[i][1];
            }
            if (tmp > l) {
                l = tmp;
            }
            tmp = 0;
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(array, i, start);
            getAll(array, start + 1, end);
            swap(array, i, start);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
