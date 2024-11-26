import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class J1Select{
    public static void main(String[] args) {
        int[] arr={5,13,19,21,37,56,64,75,80,88,92};
        System.out.println("数组的全部数据为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        boolean flag=false;
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>78){
                right=mid-1;
            } else if (arr[mid]<78) {
                left=mid+1;
            }else {
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("数组中包含数据78");
        }else {
            System.out.println("数组中不包含数据78");
        }
    }
}

class J2Operation{
    public static void main(String[] args) {
        Random R=new Random();
        int[][] arr=new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=R.nextInt(40)+30;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

class J3Zui{
    public static void main(String[] args) {
        int[][][] arr=new int[3][3][5];
        Random R=new Random();
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"层");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("第"+(j+1)+"行");
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k]=R.nextInt(70)+10;
                    if (max<arr[i][j][k]) max=arr[i][j][k];
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("最大值为："+max);
    }
}

class J4MaoPao{
    public static void main(String[] args) {
        Random R=new Random();
        int[] arr=new int[8];
        System.out.print("数组的值为：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=R.nextInt(70)+10;
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.print("排序后为：");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}