import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数");
        int i1= sc.nextInt();
        System.out.println("i1 = " + i1);
        sc.nextLine();
        //如果不加这一行会直接跳过s1的输入
        System.out.println("输入一个字符串");
        String s1=sc.nextLine();
        System.out.println("s1 = " + s1);
        System.out.println("输入一个字符串");
        String s2=sc.nextLine();
        System.out.println("s2 = " + s2);
    }
    
}
class judg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int shu=sc.nextInt();
        if(shu%2==0){
            System.out.println("您输入的是一个偶数");
        }
        else {
            System.out.println("您输入的是一个奇数");
        }
    }
}

class SW{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入颜色的标志：");
        int color=sc.nextInt();
        switch (color) {
            case 1 -> System.out.println("蓝色");
            case 2 -> System.out.println("黄色");
            case 3 -> System.out.println("白色");
            default -> System.out.println("输入错误");
        }
    }
}

class Odd{
    public static void main(String[] args) {
        System.out.println("100以内所有的奇数为：");
        for (int i = 0; i <= 100; i++) {
            if (i%2==1) System.out.print(i+" ");
        }
    }
}

class And{
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+9+10的和为："+sum);
    }
}

class Kun{
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 34; j++) {
                for (int k = 0; k < 100; k++) {
                    if (i*5+j*3+k==100&&i+j+k*3==100){
                        System.out.println("公鸡" + i + "只，母鸡" + j + "只，小鸡" + k*3 + "只");
                    }
                }
            }
        }
    }
}

class MultiplicationTable{
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+" \t");
            }
            // \t可以对齐
            System.out.println();
        }
    }
}

class Arr{
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random R=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=R.nextInt(30);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//选择排序
class SelectSort{
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random R=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=R.nextInt(20);
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}