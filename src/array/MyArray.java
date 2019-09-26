package array;

public class MyArray {
    public static Object[] addArray(Object[] oldArr, int size) {
        Object[] newArr = new Object[size];
        if (size > oldArr.length) {
            for (int i = 0; i < oldArr.length; i++) {
                newArr[i] = oldArr[i];
            }
            return newArr;
        } else if (size == oldArr.length) {
            return oldArr;
        } else {
            for (int i = 0; i < size; i++) {
                newArr[i] = oldArr[i];
            }
            return newArr;
        }
    }

    public static int[] merge2array(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int arr1_index = 0;
        int arr2_index = 0;
//        System.out.println(newArr.length);
        for (int i = 0; i < newArr.length; i++) {
            if (arr1.length >= arr2_index) {
                if ((arr1_index < arr1.length) && (arr1[arr1_index] <= arr2[arr2_index])) {
                    newArr[i] = arr1[arr1_index];
                    arr1_index++;
                } else {
                    newArr[i] = arr2[arr2_index];
                    arr2_index++;
                }
            } else {
                if ((arr2_index < arr2.length) && (arr2[arr2_index] <= arr1[arr1_index])) {
                    newArr[i] = arr2[arr2_index];
                    arr2_index++;
                } else {
                    newArr[i] = arr1[arr1_index];
                    arr1_index++;
                }
            }
//            System.out.println(arr1_index + " " + arr2_index);
//            System.out.println(newArr[i]);
//            System.out.println(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(arr.length);
//        Object[] obj = MyArray.addArray(arr, 20);
//        System.out.println(obj.length);
        int[] arr1 = {1, 3, 7, 8, 10};
        int[] arr2 = {2, 5, 6, 8, 11, 12};
        int[] res = MyArray.merge2array(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
