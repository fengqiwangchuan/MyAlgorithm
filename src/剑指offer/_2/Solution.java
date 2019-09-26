package 剑指offer._2;

public class Solution {
    public static String replaceSpace(StringBuffer str) {
        String str1 = str.toString();
        if(str1.equals("")){
            return str1;
        }
        char[] strArray = str1.toCharArray();
        int lenSpace=0;
        int len = strArray.length;
        for(int i=0;i<len;i++){
            if(' ' == strArray[i]){
                lenSpace++;
            }
        }
        int newlen = len + lenSpace * 2;
        char[] res = new char[newlen];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (strArray[i] == ' ') {
                res[j] = '%';
                res[++j] = '2';
                res[++j] = '0';
                j++;
            } else {
                res[j] = strArray[i];
                j++;
            }
        }
        return new String(res);
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello world");
        System.out.println(replaceSpace(str));
    }
}
