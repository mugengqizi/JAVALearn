package JAVA4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class J41 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
