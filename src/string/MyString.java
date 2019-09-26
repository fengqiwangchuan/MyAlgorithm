package string;

public class MyString {
    public static int[] matcher(String str, String pattern) {
        char[] ch = str.toCharArray();
        char[] re = pattern.toCharArray();
        int[] res = new int[ch.length];
        int j = 0;
        for (int i = 0; i < ch.length - re.length + 1; i++) {
            if (ch[i] == re[0]) {
                for (j = 1; j < re.length; j++) {
                    if (ch[i + j] != re[j]) {
                        break;
                    }
                }
                if (j == re.length) {
                    res[i] = i + 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = matcher("abababab", "ab");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
