package test;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = s1 + "d";
        String s4 = s2 + "d";
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
    }
}
