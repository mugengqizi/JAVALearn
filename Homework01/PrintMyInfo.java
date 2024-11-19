import java.util.Scanner;

public class PrintMyInfo {
    public static void main(String[] args) {
        String name="李高明";
        System.out.println("name = " + name);
        String sex="男性";
        System.out.println("sex = " + sex);
        int age=21;
        System.out.println("age = " + age);
        double high=1.81;
        System.out.println("high = " + high);
        String habby="玩无畏契约";
        System.out.println("habby = " + habby);
    }
}
class SanJiaoXing{
    public static void main(String[] args) {
        System.out.println("  @  ");
        System.out.println(" @@@ ");
        System.out.println("@@@@@");
    }
}
class CalculateNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个整数");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int he=a+b;
        System.out.println("两个数的和为："+he);
        int cha=a-b;
        System.out.println("两个数的差为："+cha);
        int chengJi=a*b;
        System.out.println("两个数的乘积为："+chengJi);
        if(b==0){
            System.out.println("除数不能是零哦");
        }
        else {
            double shang=(double)a/b;
            System.out.println("两个数的商为："+shang);
            int yuShu=a%b;
            System.out.println("两个数的余数为："+yuShu);
        }


    }
}
