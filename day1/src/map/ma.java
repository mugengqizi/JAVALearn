package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ma {
    public static void main(String[] args) {
        Map<String, String> Darling = new HashMap<>();
        Darling.put("大老婆", "胡桃");
        Darling.put("二老婆", "小医仙");
        Darling.put("三老婆", "神里凌华");
        Darling.put("小老婆", "神里绫华");
        System.out.println(Darling);
        System.out.println("==========================================");
        Darling.remove("三老婆");
        System.out.println(Darling);
        System.out.println("==========================================");
        System.out.println(Darling.get("大老婆"));
        System.out.println(Darling.getOrDefault("四老婆", "宵宫"));
        System.out.println("===========================================");
        Set<String> key = Darling.keySet();
//        for (String key1 : key) {
//            String value = Darling.get(key1);
//            System.out.println(key1 + "=" + value);
//        }
        Iterator<String> it = key.iterator();
        while (it.hasNext()) {
            String key2 = it.next();
            System.out.println(key2 + "=" + Darling.get(key2));
        }

        
    }
}
