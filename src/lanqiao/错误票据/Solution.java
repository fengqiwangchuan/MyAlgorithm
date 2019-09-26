package lanqiao.错误票据;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
2
5 6 8 11 9
10 12 9
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
//        换行符
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] split = line.split(" ");
            for (int j = 0; j < split.length; j++) {
                list.add(Integer.parseInt(split[j]));
            }
        }

//        System.out.println(list.size());
        Collections.sort(list);
        int a, b;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == 2) {
                a = list.get(i) - 1;
            }
            if (list.get(i).equals(list.get(i - 1))) {
                b = list.get(i);
            }
        }
        System.out.println(list);
    }
}
