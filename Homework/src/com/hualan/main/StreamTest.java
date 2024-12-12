package com.hualan.main;

import java.util.List;

public class StreamTest {
    /*
    （1）过滤字符串：给定一个字符串列表，过滤掉长度小于等于5的字符串，并将结果按照字母顺序排序。
   列表内容: [ "orange", "grape","apple", "banana", "kiwi", "pear", "watermelon"]
   过滤后的列表内容: ["banana", "watermelon"]
     */
    public static void main(String[] args) {
        System.out.println("第一问");
        List<String> list = List.of("orange", "grape", "apple", "banana", "kiwi", "pear", "watermelon");
        list.stream()
                .filter(s1 -> s1.length() > 5)
                .sorted()
                .forEach(s -> System.out.print(s + "\t"));
        /*
          转换大写：给定一个字符串列表，将其中所有字符串转换为大写并输出。
          列表内容: ["hello", "world", "java", "stream"]
          转换后的列表内容: ["HELLO", "WORLD", "JAVA", "STREAM"]
         */
        System.out.println("\n第二问");
        List<String> list2 = List.of("hello", "world", "java", "stream");
        list2.stream()
                .map(s1 -> s1.toUpperCase())
                .forEach(s -> System.out.print(s + "\t"));
    }
}
