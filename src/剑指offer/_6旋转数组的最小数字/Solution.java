package 剑指offer._6旋转数组的最小数字;

import java.util.Arrays;

public class Solution {
    //    public int minNumberInRotateArray(int [] array) {
//        Arrays.sort(array);
//        return array[0];
//    }
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int start = 0;
        int end = array.length - 1;
        while (start + 1 != end) {
            int mid = (start + end) / 2;
            if (array[mid] > array[start]) {
                start = mid;
            } else if (array[mid] == array[start]) {
                start++;
            } else {
                end = mid;
            }
        }
        return array[end];
    }
}
