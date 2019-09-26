package lanqiao.马虎的算式;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                if (a != b) {
                    for (int c = 1; c < 10; c++) {
                        if (a != b && a != c && b != c) {
                            for (int d = 1; d < 10; d++) {
                                if (a != b && a != c && a != d && b != c && b != d && c != d) {
                                    for (int e = 1; e < 10; e++) {
                                        if (
                                                a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e) {
                                            if ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)) {
                                                count++;
                                                System.out.println(a + b + "*" + c + d + e + "=" + a + d + b + "*" + c + e);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
