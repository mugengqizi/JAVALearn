import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数");
        int i1= sc.nextInt();
        sc.nextLine();
        //如果不加这一行会直接跳过s1的输入
        System.out.println("输入一个字符串");
        String s1=sc.nextLine();
        System.out.println("输入一个字符串");
        String s2=sc.nextLine();

    }

}