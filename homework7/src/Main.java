import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class J1MinOfTwoInt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入两个整数");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("两个数的最小值为："+minOfTwoInt(a,b));
    }
    public static int minOfTwoInt(int a,int b){
        return a>b?b:a;
    }
}

class J2LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入要查询的年份：");
        int year= sc.nextInt();
        isLeapYear(year);
    }
    public static void isLeapYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"年是闰年");
        }else {
            System.out.println(year+"年不是闰年");
        }
    }
}

class J3ArrPrint{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        System.out.print("请输入要打印的数组：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(" ");
        printIntArr(arr);
    }
    public static void printIntArr(int[] arr){
        System.out.print("数组为：[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println(arr[arr.length-1]+"]");
    }
}

class J4Inserted{
    public static void main(String[] args) {
        int[] arr= {35, 22, 17, 41, 72, 29, 10, 0, 0, 0};
        System.out.print("插入66前的数组为：");
        System.out.println(Arrays.toString(arr));
        for (int i = 6; i >= 1; i--) {
            arr[i+1]=arr[i];
        }
        arr[1]=66;
        System.out.print("插入66后的数组为：");
        System.out.println(Arrays.toString(arr));
    }
}

class J5Limit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.print("请输入一个0~9之间的数：");
            double num=sc.nextDouble();
            if(limit(num)){
                System.out.println("输入的值合法");
                break;
            }else {
                System.out.println("输入的值不合法，请重新输入");
            }
        }
    }
    public static boolean limit(double num){
        if (num<=9&&num>=0) return true;
        else return false;
    }
}