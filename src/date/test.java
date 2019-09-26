package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(new Date()));
        String str = sdf.format(new Date());
        Date now = new Date();
        System.out.println(now.getTime());
    }
}
