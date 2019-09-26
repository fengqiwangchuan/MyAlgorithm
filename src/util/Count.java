package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Count {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("./src/util/renyuan.txt");
            BufferedReader bufferedReader = new BufferedReader(file);
            String b = "";
            ArrayList<String> al = new ArrayList();
            while ((b = bufferedReader.readLine()) != null) {
                String[] str = b.split("\\s+");
                for (int i = 0; i < str.length; i++) {
                    al.add(str[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
