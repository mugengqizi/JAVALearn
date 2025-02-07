package JAVA1;

import java.util.Scanner;

public class j16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer i = scanner.nextInt();
        String s1 = i.toBinaryString(i);
        System.out.println(i + "的二进制是" + s1);
    }
}
