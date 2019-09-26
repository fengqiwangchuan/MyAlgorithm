package test;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class test {
    public static void main(String[] args) {
        Field[] fields = MedicalCase.class.getDeclaredFields();
        Map<String, Class> properties = new HashMap<>();

        for (int i = 0; i < fields.length; i++) {
            properties.put(fields[i].getName(), fields[i].getType());
        }
        System.out.println(properties.keySet());
        Iterator it = properties.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(properties.get(it.next()));

        }
    }

    @Test
    public void test1() {
        String str = "90.0";
//        System.out.println(str.endsWith(".0"));
        str += "hello";
        int length = str.length();
        System.out.println(length);
        System.out.println(str);
        System.out.println(str.substring(0, str.lastIndexOf(".")));

    }

    @Test
    public void test2() {
        char c = 'A';
        System.out.println(c=='A');
        System.out.println("TCTTACCGCCTACCGGGAACGTCTCTTCCAAAGGCCTGTGAAACGCAGTTTCTTTGCAGGACTGNTNNGGCGGAA".length());
    }

    @Test
    public void test3() {
        Properties properties = System.getProperties();
        String osName = properties.getProperty("os.name");
        String osArch = properties.getProperty("os.arch");
        String osVersion = properties.getProperty("os.version");
        System.out.println(osName);
        System.out.println(osArch);
        System.out.println(osVersion);
    }
}
