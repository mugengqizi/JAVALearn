package homework8;

import java.util.Random;

public class IndexOfNum {
    public static void main(String[] args) {
        Random R = new Random();
        int[] arr = new int[6];
        System.out.println("数组的全部元素为：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = R.nextInt(5);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int num = 3;
        System.out.println("indexOfNum方法的返回值为：");
        System.out.println(indexOfNum(num, arr));
    }

    public static int indexOfNum(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }
}
