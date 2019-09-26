package leetcode._1_two_sum;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7};
        int target = 15;
        int[] result = twoSum2(test, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] twoSum1(int[] array, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int need = target - array[i];
            if (hashMap.containsKey(need) && hashMap.get(need) != i) {
                return new int[]{i, hashMap.get(need)};
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    public static int[] twoSum2(int[] array, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int need = target - array[i];
            if (hashMap.containsKey(need) && hashMap.get(need) != i) {
                return new int[]{hashMap.get(need), i};
            }
        }
        throw new IllegalArgumentException("no solution");
    }

}
