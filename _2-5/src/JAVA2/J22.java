package JAVA2;

import java.util.Arrays;

public class J22 {
    public static void main(String[] args) {
        Integer[] i1 = {1, 2, 3, 6, 0, 2};
        Integer sum = 0;
        for (Integer integer : i1) {
            sum += integer;
        }
        Double ave = (double) sum / i1.length;
        System.out.println(Arrays.toString(i1) + "的平均值为：" + ave);
    }

}
