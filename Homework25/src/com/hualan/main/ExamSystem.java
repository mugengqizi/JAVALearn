package com.hualan.main;

import com.hualan.service.ExamService;

import java.io.IOException;
import java.util.Scanner;

public class ExamSystem {
    /**
     * 打印菜单
     */

    public static void printMenu() {
        System.out.println("==============");
        System.out.println("华蓝在线考试系统");
        System.out.println("1.进入考试");
        System.out.println("2.查看上次考试成绩");
        System.out.println("3.退出系统");
        System.out.print("请选择：");
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ExamService examService = new ExamService();
        while (true) {
            printMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    examService.startExam();
                    break;
                case "2":
                    examService.printLastExam();
                    break;
                case "3":
                    System.out.println("退出系统");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }
}
