package JAVA5;


public class J51 {
    public static void main(String[] args) throws ArithmeticException {
        int a = 3;
        try {
            System.out.println(a / 0);

        } catch (ArithmeticException e) {
            System.out.println("除数为0");
        }
    }
}
