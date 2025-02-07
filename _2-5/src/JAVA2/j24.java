package JAVA2;

import java.util.Arrays;

public class j24 {
    public static void main(String[] args) {
        int[] i1 = {1, 3, 5, 7};
        int[] i2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(heBing(i1, i2)));
    }

    public static int[] heBing(int[] a, int[] b) {
        int i = 0, j = 0;
        int[] last = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                last[i + j] = a[i];
                i++;
            } else {
                last[i + j] = b[j];
                j++;
            }
        }
        while (i < a.length) {
            last[i + j] = a[i];
            i++;
        }
        while (j < b.length) {
            last[i + j] = b[j];
            j++;
        }
        return last;
    }
}
