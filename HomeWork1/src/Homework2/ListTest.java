package Homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.print("请输入五个字符串：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            list.add(s);
        }
        list.set(1, "华蓝集团");
        list.add(2, "JAVA");
        list.remove(0);
        System.out.println(list);
        System.out.println("元素个数" + list.size());
    }
}
