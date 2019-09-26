package leetcode.sort;

public class SelectSort {
    public static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            // 找出最小值的下标
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            // 将最小值放到未排序记录的第一个位置
            if (k > i) {
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 4, 6, 8, 1};
        selectSort(a);
        for (int i : a
        ) {
            System.out.print(i + " ");
        }
    }
}
