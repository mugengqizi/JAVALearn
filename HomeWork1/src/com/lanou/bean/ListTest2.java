package com.lanou.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        List<Ticket> list = new ArrayList<>();
        list.add(new Ticket(" Z286", "11:05", 358, 185));
        list.add(new Ticket("G802", "17:11", 139, 368));
        list.add(new Ticket("G554", "09:22", 206, 350));
        list.add(new Ticket("G80", "13:10", 140, 368));
        list.add(new Ticket("G402", "20:41", 181, 355));
        System.out.println(list);
        System.out.println("=========================================");
        System.out.println("按出发时间升序排序");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        list.sort((s1, s2) -> {
            try {
                return sdf.parse(s1.getStartTime()).compareTo(sdf.parse(s2.getStartTime()));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(list);
        System.out.println("=========================================");
        System.out.println("按历时升序排序");
        list.sort(Comparator.comparing(Ticket::getDuration));
        System.out.println(list);
        System.out.println("=========================================");
        System.out.println("按票价进行降序排序");
        list.sort((s1, s2) -> s2.getPrice().compareTo(s1.getPrice()));
        System.out.println(list);
    }
}
