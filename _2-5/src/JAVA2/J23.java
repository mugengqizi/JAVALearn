package JAVA2;

import java.util.Arrays;
import java.util.Collections;

public class J23 {
    public static void main(String[] args) {
        Integer[] i1 = {1, 2, 3, 6, 0, 2};
        Collections.reverse(Arrays.asList(i1));
        System.out.println(Arrays.toString(i1));
    }
}
