package JAVA6;

import java.util.Calendar;

public class J62 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DATE) + "日" + calendar.get(Calendar.HOUR_OF_DAY) + "时" + calendar.get(Calendar.MINUTE) + "分" + calendar.get(Calendar.SECOND) + "秒");
        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DATE, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        System.out.println(calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DATE) + "日" + calendar.get(Calendar.HOUR_OF_DAY) + "时" + calendar.get(Calendar.MINUTE) + "分" + calendar.get(Calendar.SECOND) + "秒");
        calendar.set(2022, 2, 2, 2, 2, 2);
        System.out.println(calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DATE) + "日" + calendar.get(Calendar.HOUR_OF_DAY) + "时" + calendar.get(Calendar.MINUTE) + "分" + calendar.get(Calendar.SECOND) + "秒");
    }
}
