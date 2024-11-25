import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class J1XunHuanQianTao3{
    public static void main(String[] args) {
        System.out.print("共需");
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 12; j++) {
                int k=36-4*i-3*j;
                if (i+j+2*k==36){
                    System.out.println("男"+i+"个，女"+j+"个，小孩"+2*k+"个");
                }
            }
        }
    }
}

class J2Max{
    public static void main(String[] args) {
        int[] arr={10,8,23,41,52,66,34,12};
        int max=0;
        for (int j : arr) {
            if (max < j) max = j;
        }
        System.out.println("数组的最大值为："+max);
    }
}

class J3Average{
    public static void main(String[] args) {
        int[] arr=new int[5];
        int sum=0;
        Random R=new Random();
        System.out.print("数组中所有的数为：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=R.nextInt(20)+10;
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        double average=sum/arr.length;
        System.out.println("数组的平均值为："+average);
        System.out.print("高于平均值的数为：");
        for (int j : arr) {
            if (j > average) {
                System.out.print(j + " ");
            }
        }
        System.out.println(" ");
        System.out.print("低于平均值的数为：");
        for (int j : arr) {
            if (j < average) {
                System.out.print(j + " ");
            }
        }
    }
}

class J4Find18{
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random R=new Random();
        System.out.println("查找数组中是否包含18");
        System.out.print("数组中所有的数为：");
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=R.nextInt(20)+10;
            System.out.print(arr[i]+" ");
            if(arr[i]==18){
                flag=true;
            }
        }
        System.out.println(" ");
        if(flag){
            System.out.print("值为18的元素的下标为：");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==18){
                    System.out.print(i);
                }
            }
        }else {
            System.out.println("数组中不包含18");
        }
    }
}

class J5Select{
    public static void main(String[] args) {
        int[] arr={5,13,19,21,37,56,64,75,80,88,92};
        boolean flag78=false,flag21=false,flag13=false;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case 78: flag78=true;
                case 21:flag21=true;
                case 13:flag13=true;
            }
        }
        if(flag78) System.out.println("数组中包含数据78");
        else System.out.println("数组中不包含数据78");
        if(flag21) System.out.println("数组中包含数据21");
        else System.out.println("数组中不包含数据21");
        if(flag13) System.out.println("数组中包含数据13");
        else System.out.println("数组中不包含数据13");
    }
}