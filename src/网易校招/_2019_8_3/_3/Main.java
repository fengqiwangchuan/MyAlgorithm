package 网易校招._2019_8_3._3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int tmp;
        int index;
        for (int i = 0; i < n; i++) {
            index = getRestMin(a, i);
            if (a[i] > a[index] && (a[i] + a[index]) % 2 == 1) {
                tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int getRestMin(int[] a, int cur) {
        int min = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (i != cur && a[i] < min) {
                index = i;
            }
        }
        return index;
    }
}
