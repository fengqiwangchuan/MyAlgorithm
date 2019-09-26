package lanqiao.从我做起振兴中华;

public class Solution {
    public static void main(String[] args) {
        // 重复
        // 变化
        // 边界
        int ans = f(0, 0);
        System.out.println(ans);
    }

    private static int f(int i, int j) {
        if (i == 3 || j == 4) {
            return 1;
        }
        return f(i + 1, j) + f(i, j + 1);
    }
}
