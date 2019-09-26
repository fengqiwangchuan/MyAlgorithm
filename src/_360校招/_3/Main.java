package _360校招._3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        double res = 0;
        double tmp = 0;
        if (M == 0) {
            res = 0;
            System.out.print(0.000);
        } else if (N == M && N != 0) {
            for (int i = 0; i < N; i++) {
                res += a[i];
            }
            res /= M;
            System.out.print(new BigDecimal(res).setScale(3, RoundingMode.HALF_UP).doubleValue());
        } else {

            for (int i = 0; i <= N - M; i++) {
                for (int j = i; j < M + i; j++) {
                    tmp += a[j];
                }
                tmp /= M;
                if (tmp > res) {
                    res = tmp;
                }
                tmp = 0;
            }
            System.out.print(new BigDecimal(res).setScale(3, RoundingMode.HALF_UP).doubleValue());
        }


    }

}
