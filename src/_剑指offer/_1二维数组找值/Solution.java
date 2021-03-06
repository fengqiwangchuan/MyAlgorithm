package _剑指offer._1二维数组找值;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length==0||array[0].length==0){
            return false;
        }
        int rows = array.length-1;
        int cols = array[0].length-1;
        int i = 0;
        int j = cols;
        while(i<=rows&&j>=0){
            if(target<array[i][j]){
                j--;
            }else if(target>array[i][j]){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().Find(7,new int[][]{{1,2,3},{4,5,6}}));
    }
}
