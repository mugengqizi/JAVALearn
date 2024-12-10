package Homework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class J2ListTest {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        list.add(new Worker("zhangsan", 21, 3000));
        list.add(new Worker("lisi", 25, 3600));
        list.add(new Worker("wangwu", 22, 3200));
        list.add(0, new Worker("zhaoliu", 23, 3300));
        System.out.println(list);
        System.out.println("=========================================");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals("zhangsan")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        System.out.println("==========================================");
        Iterator<Worker> it = list.iterator();
        while (it.hasNext()) {
            Worker w = it.next();
            w.work();
        }
        System.out.println("=========================================");
        System.out.println("请输入一个工人的信息：");
        Scanner sc = new Scanner(System.in);
//        System.out.print("姓名为：");
//        String name1 = sc.nextLine();
//        System.out.print("年龄为：");
//        Integer age1 = sc.nextInt();
//        System.out.print("工资为：");
//        double salary1 = sc.nextDouble();
        list.add(new Worker(sc.nextLine(), sc.nextInt(), sc.nextDouble()));
//        list.add(new Worker(name1, age1, salary1));

        System.out.println(list);
    }
}
