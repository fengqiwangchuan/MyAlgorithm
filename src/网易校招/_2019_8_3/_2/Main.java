package 网易校招._2019_8_3._2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[][] num = new long[t][];
        long n = 0;
        for (int i = 0; i < t; i++) {
            n = sc.nextLong();
            num[i] = new long[(int) n];
            for (int j = 0; j < n; j++) {
                num[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(check(num[i]));
        }
    }

    private static String check(long[] d) {
        String res = "YES";
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (i == 0 && d[i] >= (d[1] + d[d.length])) {
                res = "NO";
            }
            if (i == d.length - 1 && d[i] >= (d[i - 1] + d[0])) {
                res = "NO";
            }
            if (i != 0 && i != d.length - 1 && d[i] >= (d[i - 1] + d[i + 1])) {
                res = "NO";
            }
        }
        return res;
    }
}

//if (d[(i + 1) % d.length] < (d[i % d.length] + d[(i + 2) % d.length])) {
//
//            } else {
//                res = "NO";
//            }