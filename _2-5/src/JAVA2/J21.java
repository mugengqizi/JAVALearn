package JAVA2;

import java.util.Arrays;

public class J21 {
    public static void main(String[] args) {
        Integer[] i1 = {1, 2, 3, 6, 0, 2};
        System.out.println(Arrays.toString(i1) + "的最大值为：" + max(i1));
    }

    public static Integer max(Integer[] a) {
        Integer max = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }
}
