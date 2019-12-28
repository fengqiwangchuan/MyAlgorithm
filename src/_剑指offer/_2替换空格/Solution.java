package _剑指offer._2替换空格;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        if (s.equals("")) {
            return s;
        }
        char[] chs = s.toCharArray();
        int i = 0;
        int len = 0;
        while (i < chs.length) {
            if (chs[i] == ' ') {
                len++;
            }
            i++;
        }
        char[] newStr = new char[chs.length + 2 * len];
        int j = newStr.length - 1;
        i = chs.length - 1;
        while (i >= 0) {
            if (chs[i] == ' ') {
                newStr[j--] = '0';
                newStr[j--] = '2';
                newStr[j--] = '%';
                i--;
            } else {
                newStr[j--] = chs[i--];
            }
        }
        return new String(newStr);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().replaceSpace(new StringBuffer("we are happy")));

    }
}
