package leetcode.search;

public class BinarySearch {
    public static int binarySearch(int[] array, int a) {
        int lo = 0;
        int hi = array.length - 1;
        int mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] < a) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static int fuzzyBinarySearch(int[] array, int a) {
        int lo = 0;
        int hi = array.length - 1;
        int mid;
//        while ()
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8};
        System.out.println(binarySearch(a, 5));
    }
}
