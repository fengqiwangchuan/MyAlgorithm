package _360校招._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[] res = new int[n];
        int max = 0;
        int tmp;
        int swap;
        int[][] ext = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                ext[i][j] = a[i][j];
            }
        }
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            for (int o = 0; o < n; o++) {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < n; l++) {
                        for (int k = 0; k < n; k++) {
                            res[k] = (a[0][k] + a[1][k]) % m;
                            sb.append(res[k]);
                        }
                        tmp = Integer.parseInt(sb.toString());
                        sb.delete(0, sb.length());
                        if (tmp > max) {
                            max = tmp;
                        }
                        if (j != l) {
                            swap = a[1][l];
                            a[1][l] = a[1][j];
                            a[1][j] = swap;
                        }
                    }
                }
                if (i != o) {
                    swap = a[0][o];
                    a[0][o] = a[0][i];
                    a[0][i] = swap;
                }
            }
        }
        String str = new String(String.valueOf(max));
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
    }
}
