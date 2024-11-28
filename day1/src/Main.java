import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        out.println("输入一个整数");
        int i1= sc.nextInt();
        out.println("i1 = " + i1);
        sc.nextLine();
        //如果不加这一行会直接跳过s1的输入
        out.println("输入一个字符串");
        String s1=sc.nextLine();
        out.println("s1 = " + s1);
        out.println("输入一个字符串");
        String s2=sc.nextLine();
        out.println("s2 = " + s2);
    }
    
}
class judg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        out.println("请输入一个整数");
        int shu=sc.nextInt();
        if(shu%2==0){
            out.println("您输入的是一个偶数");
        }
        else {
            out.println("您输入的是一个奇数");
        }
    }
}

class SW{
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        out.println("请输入颜色的标志：");
        int color=sc.nextInt();
        switch (color) {
            case 1 -> out.println("蓝色");
            case 2 -> out.println("黄色");
            case 3 -> out.println("白色");
            default -> out.println("输入错误");
        }
    }
}

class Odd{
    public static void main(String[] args) {
        out.println("100以内所有的奇数为：");
        for (int i = 0; i <= 100; i++) {
            if (i%2==1) out.print(i+" ");
        }
    }
}

class And{
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            sum += i;
        }
        out.println("1+2+3+...+9+10的和为："+sum);
    }
}

class Kun{
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 34; j++) {
                for (int k = 0; k < 100; k++) {
                    if (i*5+j*3+k==100&&i+j+k*3==100){
                        out.println("公鸡" + i + "只，母鸡" + j + "只，小鸡" + k*3 + "只");
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
                out.print(j+"*"+i+"="+i*j+" \t");
            }
            // \t可以对齐
            out.println();
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
            out.println(arr[i]);
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
            out.print(arr[i]+" ");
        }
        out.println(" ");
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
            out.print(arr[i]+" ");
        }
    }
}

class FangFA{
    public static void main(String[] args) {
        Random R=new Random();
        int a=R.nextInt(30);
        int b=R.nextInt(30);
        System.out.println("和为："+and(a,b));
    }
    public static int and(int a,int b){
        return a+b;
    }
}

class KuaiPai{
    public static void main(String[] args) {
        Random R=new Random();
        int[] arr=new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=R.nextInt(30);
            out.print(arr[i]+" ");
        }
        out.println(" ");
       quicks(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]+" ");
        }
    }
    public static void quicks(int[] arr,int low,int high){
        if(low>high) return;
        int i=low,j=high,temp=arr[low];
        while (i<j){
            while (temp<=arr[j]&&i<j){
                j--;
            }
            while (temp>=arr[i]&&i<j){
                i++;
            }
            if(i<j){
                int mid=arr[i];
                arr[i]=arr[j];
                arr[j]=mid;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        quicks(arr,low,j-1);
        quicks(arr,j+1,high);
    }
}

