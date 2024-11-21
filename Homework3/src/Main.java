import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*
* 1，月份和季节
创建一个SwitchTest类，在类的main方法里编写代码，完成如下功能：
(1) 输入一个代表月份的整数，根据输入的整数输出季节名称。
> 春季3,4,5；夏季6,7,8；秋季9,10,11；冬季12,1,2。
* */
class SwitchTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入需要查询的月份：");
        int month=sc.nextInt();
        if(month==3||month==4||month==5){
            System.out.println("春季");
        } else if (month==6||month==7||month==8) {
            System.out.println("夏季");
        } else if (month==9||month==10||month==11) {
            System.out.println("秋季");
        }else {
            System.out.println("冬季");
        }
    }
}
/*
2，水仙花数
在控制台打印出所有的水仙花数。水仙花数：是一个三位数，水仙花数的个位、十位、百位
数字的立方之和等于原数。
*/
class Daffodils{
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int bai=i/100,shi=i%100/10,ge=i%100%10;
            if((bai*bai*bai+shi*shi*shi+ge*ge*ge)==i){
                System.out.println(i+"是一个水仙花数");
            }
        }
    }
}


/*
3，交换变量
控制台输入两个数字，分别被a、b接收到，编程交换他们的值
*/
class Swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入a：");
        int a=sc.nextInt();
        System.out.print("请输入b：");
        int b=sc.nextInt();
        int mid=a;
        a=b;
        b=mid;
        System.out.println("a为："+a+"b为："+b);
    }
}

/*
4，随机数
产生1个取值范围在[5,18)的随机数。
*/
class Random1{
    public static void main(String[] args) {
        Random R=new Random();
        System.out.println("产生一个范围在[5,18)的随机数为："+(R.nextInt(13)+5));
    }
}


/*
5，for练习
创建一个ForTest类，在类的main方法里面编写代码， 完成如下功能：

   (1) 编写代码，通过for循环打印100以内(不含0，不含100)所有能被5整除的数。

   (2) 编写代码，从控制台输入一个正整数保存在变量n中，计算n的阶乘。

   (3) 编写代码，随机产生10个[5, 30]之间的整数， 输出这个10个随机数，并计算出10个数中的最大值， 最小值， 和以及平均数。
 */
class ForTest{
    public static void main(String[] args) {
        //打印100以内(不含0，不含100)所有能被5整除的数
        System.out.println("100以内(不含0，不含100)所有能被5整除的数为：");
        for (int i = 1; i < 100; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //计算n的阶乘。
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入需要计算阶乘的数n：");
        int n=sc.nextInt(),sum=1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("n的阶乘为："+sum);
        //随机生成10个[5, 30]之间的整数
        Random R=new Random();
        int[] num=new int[10];
        int max=0,min=31,Sum=0;
        System.out.println("随机生成的10个数为：");
        for (int i = 0; i < 10; i++) {
            num[i]=R.nextInt(31);
            max=Math.max(num[i],max);
            min=Math.min(num[i],min);
            Sum+=num[i];
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("最大值为："+max+"   最小值为："+min+"     平均值为："+Sum/10);

    }
}

/*
6，while练习
创建一个WhileTest类，在类的main方法里面编写代码，完成如下功能：

   (1) 如果你是一个富二代，你有10亿元（1000000000），每天花一半，多天可以花完。编写代码，使用while循环计算10亿元可以花多少天？
 */
class WhileTest{
    public static void main(String[] args) {
        int money=1000000000,i=0;
        while (money/2!=0){
            i++;
            money /=2;
        }
        System.out.println("可以花"+i+"天");
    }
}
/*
创建一个DoWhileTest类，在类的main方法里面编写代码，完成如下功能：

   (1) 编写代码，通过do..while循环计算1+2+3+...+100的和。
*/
class DoWhileTest{
    public static void main(String[] args) {
        int sum=1,i=1;
        do {
            i++;
            sum += i;
        }while (i<100);
        System.out.println("1+2+3+...+100的和为："+sum);
    }
}