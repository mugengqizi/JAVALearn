package ceshi;

import java.util.*;


public class cesh {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("123");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });

//        list.sort((a, b) -> b.compareTo(a));
//        list.sort(Integer::compareTo);
        list.sort(Comparator.reverseOrder());

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println(next);
        }
        for (Integer next : list) {
            System.out.println(next);
        }

    }
}
