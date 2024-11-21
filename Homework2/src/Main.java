import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class DuiZi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("斗地主");
        System.out.print("请输入摸到的第一张牌：");
        int a = sc.nextInt();
        System.out.print("请输入摸到的第二张牌:");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("你摸了一个对子");
        }else {
            System.out.println("不是对子");
        }
    }
}

class IfTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("去旅行的人数为：");
        int people = sc.nextInt();
        int last=(people%3==0)?0:1;
        System.out.print("需要的房间数为："+(people/3+last));
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("考试的分数为：");
        int score = sc.nextInt();
        if(score == 100){
            System.out.println("奖励你一架航拍遥控飞机");
        } else if (score >= 90) {
            System.out.println("奖励游乐场玩一次");
        } else if (score >= 80) {
            System.out.println("奖励玩具赛车一辆");
        } else if (score >= 70) {
            System.out.println("奖励玩手机30分钟");
        } else {
            System.out.println("挨揍一顿");
        }
    }
}

class CalculateTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入三角形的三条边：");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a+b > c && a+c >b && b+c >a){
            System.out.println("能构成三角形，三角形的周长为："+(a+b+c));
        }else {
            System.out.println("输入的3条边不能构成三角形");
        }
    }
}

class CalculateMoney{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提示用户输入一个1000以内的金额
        System.out.print("请输入一个1000以内的金额：");
        int money=sc.nextInt();
        //检查输入的金额是否在范围内
        if(money<0||money>1000){
            System.out.println("输入的金额不在范围内");
        }
        //定义面额
        int[] denominations={100,50,20,10,5,2,1};
        int[] count=new int[7] ;

        //计算每种面额的数量
        for (int i = 0; i < denominations.length; i++) {
            count[i]=money/denominations[i];
            money %= denominations[i];
        }

        //输出结果
        System.out.println("100元的个数为："+count[0]);
        System.out.println("50元的个数为："+count[1]);
        System.out.println("20元的个数为："+count[2]);
        System.out.println("10元的个数为："+count[3]);
        System.out.println("50元的个数为："+count[4]);
        System.out.println("2元的个数为："+count[5]);
        System.out.println("1元的个数为："+count[6]);
    }
}