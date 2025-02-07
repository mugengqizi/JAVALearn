package JAVA4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class J43 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "芬妮");
        hashMap.put(2, "丽芙");
        hashMap.put(3, "胡桃");
        Set<Integer> set1 = hashMap.keySet();
        for (Integer i : set1) {
            System.out.println("[" + i + "," + hashMap.get(i) + "]");
        }
        Set<Map.Entry<Integer, String>> set2 = hashMap.entrySet();
        for (Map.Entry<Integer, String> e : set2) {
            System.out.println("[" + e.getKey() + "," + e.getValue() + "]");
        }
    }
}
