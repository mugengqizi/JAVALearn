package homework8;

import java.util.Random;
import java.util.Scanner;

public class Teacher {
    private int num;
    private String salary;

    public Teacher(int num, String salary) {
        this.num = num;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "num=" + num +
                ", salary='" + salary + '\'' +
                '}';
    }
}

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random R = new Random();
        boolean flag = false;
        System.out.println("薪资是12k的教师的信息为：");
        for (int i = 1; i <= 10; i++) {
            int salary = R.nextInt(8) + 8;
            Teacher teacher = new Teacher(i + 99, salary + "k");
            if (salary == 12) {
                System.out.println(teacher.toString());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("无");
        }
    }
}
