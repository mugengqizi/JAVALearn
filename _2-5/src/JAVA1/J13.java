package JAVA1;

import java.util.Scanner;

public class J13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (judge(a)) {
            System.out.println(a + "是偶数");
        } else {
            System.out.println(a + "不是偶数");
        }
    }

    public static boolean judge(int a) {
        if (a % 2 == 0) return true;
        return false;
    }
}
