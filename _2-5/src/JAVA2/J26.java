package JAVA2;

import java.util.Arrays;

public class J26 {
    public static void main(String[] args) {
        int[] a = {4, 6, 78, 1, 3, 5, 7};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
