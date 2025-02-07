package JAVA2;

import java.util.ArrayList;
import java.util.List;

public class J25 {
    public static void main(String[] args) {
        int[] i1 = {1, 3, 5, 7, 3};
        List<Integer> last1 = suo(i1, 3);
        if (last1.size() == 0) System.out.println("不包含");
        else System.out.println(last1);
    }

    public static List<Integer> suo(int[] a, int b) {
        List<Integer> last = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) last.add(i);
        }
        return last;
    }
}
