package JAVA5;

public class j53 extends Exception {
    public static void main(String[] args) {
        try {
            int a = 3;
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("出现了算数异常");
            e.printStackTrace();
        } finally {
            System.out.println("我是finally块");
        }
    }
}
