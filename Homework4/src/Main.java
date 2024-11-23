import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//1
class VIPLevel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score<=0){
            System.out.println("不是会员");
        } else if (score<=500) {
            System.out.println("普通会员");
        } else if (score<=2000) {
            System.out.println("白银会员");
        } else if (score<=10000) {
            System.out.println("黄金会员");
        } else{
            System.out.println("钻石会员");
        }
    }
}

//2
class CheckNumber{
    public static void main(String[] args) {
        System.out.println("请输入一个三位数");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bai=n/100,shi=n%100/10,ge=n%100%10;
        if (bai>shi&&shi>ge){
            System.out.println("是降序数");
        }else {
            System.out.println("不是降序数");
        }
    }
}

//3
class Sum{
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 4 ; i++) {
            int sumIn=1;
            for (int j = 1; j <= i ; j++) {
                sumIn*=j;
            }
            sum+=sumIn;
        }
        System.out.println("1! + 2! + 3! + 4!的和是"+sum);
    }
}

//4
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

//5
class CheckPrimeNumber{
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),flag=1;
        if (n==1){
           flag=0;
        }  else {
            for (int i = 2; i <n ; i++) {
                if (n%i==0){
                    flag=0;
                    break;
                }
            }
        }
        if (flag==1){
            System.out.println("数字"+n+"是质数");
        }
        else {
            System.out.println("数字"+n+"不是质数");
        }
    }
}

//6
class ControlMenu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.print("1.查询学生   ");
            System.out.print("2.添加学生   ");
            System.out.print("3.编辑学生   ");
            System.out.print("4.删除学生   ");
            System.out.println("5.退出   ");
            System.out.print("请输入要执行的功能：");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("查询学生");
            } else if (n==2) {
                System.out.println("添加学生");
            } else if (n==3) {
                System.out.println("编辑学生");
            } else if (n==4) {
                System.out.println("删除学生");
            } else if (n==5) {
                System.out.println("退出");
                break;
            }else {
                System.out.println("输入的操作不合法，请重新输入");
            }
        }
    }
}

//7
class XunHuanQianTao2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入行数：");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if(j<=n-i||j>=n+i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}