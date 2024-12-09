package Homework;

public class ShuiXianHua {
    public static void main(String[] args) {
        String str = "470";
        int a = Integer.parseInt(str);
        System.out.print(a);
        while (str.length() == 3) {
            int bai = a / 100, shi = a / 10 % 10, ge = a % 10;
            if (Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3) == a) {
                System.out.println("是水仙花数");
            } else {
                System.out.println("不是水仙花数");
            }
        }
    }

}
