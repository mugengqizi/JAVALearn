package JAVA4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class J42 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("胡桃");
        set.add("丽芙");
        set.add("芬妮");
        for (String i :
                set) {
            System.out.println(i);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
