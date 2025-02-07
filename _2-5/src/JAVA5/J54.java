package JAVA5;

import java.util.Scanner;

public class J54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        try {
            System.out.println(s1);
            int a = Integer.parseInt(s1);
            System.out.println("数字" + a);
        } catch (NumberFormatException e) {
            System.out.println("输入的是无效数字");
        }
    }
}
