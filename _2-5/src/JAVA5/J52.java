package JAVA5;

public class J52 extends Exception {
    public static void main(String[] args) throws ArithmeticException {
        ss1();
    }

    public static void ss1() throws ArithmeticException {
        int a = 3;
        System.out.println(a / 0);
    }
}
