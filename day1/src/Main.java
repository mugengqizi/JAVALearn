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
        switch(color){
            case 1:
                System.out.println("蓝色");
                break;
            case 2:
                System.out.println("黄色");
                break;
            case 3:
                System.out.println("白色");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}