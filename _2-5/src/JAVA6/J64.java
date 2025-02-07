package JAVA6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J64 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);
        Date date1 = sdf.parse(s);
        System.out.println(date1);
    }
}
