import org.junit.Test;

public class App {

    @Test
    public void test() {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
//        System.err.println(str1 == str2);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str2);
    }
}
