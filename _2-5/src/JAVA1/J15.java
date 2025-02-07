package JAVA1;

public class J15 {
    public static void main(String[] args) {
        int left = 1, right = 100;
        System.out.println("1-100的和为：" + sum(left, right));
    }

    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
