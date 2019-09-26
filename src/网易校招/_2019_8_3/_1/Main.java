package 网易校招._2019_8_3._1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextDouble();
        }
        int q = sc.nextInt();
        int[] num = new int[q];
        for (int i = 0; i < q; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(get(score, num[i]));
        }
    }

    private static BigDecimal get(double[] score, int num) {
        double count = 0, len = score.length;
        for (int i = 0; i < score.length; i++) {
            if (i != num - 1 && score[i] <= score[num - 1]) {
                count++;
            }
        }
        double res = count / len * 100;
        BigDecimal b = new BigDecimal(res);
        return b.setScale(6, RoundingMode.HALF_UP);
    }
}
