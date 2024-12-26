package com.hualan.service;

import com.hualan.bean.ExamItem;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExamService implements Serializable {
    Scanner scanner = new Scanner(System.in);

    public ExamService() {
        init();
    }

    /**
     * 考题列表
     */
    List<ExamItem> itemList = new ArrayList<>();
    /**
     * 答案数组
     */
    static String[] answerrArr;
    /**
     * 得分
     */
    Integer score = 0;

    /**
     * 初始化方法
     */
    public void init() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Homework25/Items.txt"))) {
            String line;
            int count = 0;
            ExamItem item = new ExamItem();
            while ((line = reader.readLine()) != null) {
                count++;
                switch (count) {
                    case 1 -> item.setTitle(line);
                    case 2 -> item.setOptionA(line);
                    case 3 -> item.setOptionB(line);
                    case 4 -> item.setOptionC(line);
                    case 5 -> item.setOptionD(line);
                    case 6 -> {
                        item.setAnswer(line);
                        itemList.add(item);
                        item = new ExamItem();
                        count = 0;
                    }
                    default -> {
                    }
                }
            }
            answerrArr = new String[itemList.size()];
            Arrays.fill(answerrArr, "null");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印操纵说明
     */
    public void showHelp() {
        System.out.println("-----------欢迎进入考试-----------");
        System.out.println("      使用以下按键进行考试:\n");
        System.out.println("      A-D:选择指示答案");
        System.out.println("      P  :显示上一题");
        System.out.println("      N  :显示下一题");
        System.out.println("      F  :交卷\n");
        System.out.println("      请按N进入考试...");
    }

    /**
     * 开始考试方法
     */
    public void startExam() {
        Arrays.fill(answerrArr, "null");
        score = 0;
        while (true) {
            showHelp();
            String ser = scanner.next();
            if (ser.equalsIgnoreCase("N")) {
                break;
            }
        }
        for (int i = 0; i < itemList.size(); i++) {
            ExamItem item = itemList.get(i);
            System.out.println(item.getTitle() + "\n" + item.getOptionA() + "\n" + item.getOptionB() + "\n" + item.getOptionC() + "\n" + item.getOptionD());
            if (!answerrArr[i].equalsIgnoreCase("null")) {
                System.out.print("您这道题已经作答,选的是" + answerrArr[i].toUpperCase() + "输入A-D更换答案,输入P上一题,N下一题,输入F交卷:");
            }
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("N")) {
                if (i == itemList.size() - 1) {
                    System.out.println("已经是最后一题了");
                    i--;
                }
            } else if (answer.equalsIgnoreCase("P")) {
                if (i == 0) {
                    System.out.println("已经是第一题了");
                } else {
                    i -= 2;
                }
            } else if (answer.equalsIgnoreCase("F")) {
                judgeExam();
                save();
                break;
            } else if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("C") || answer.equalsIgnoreCase("D")) {
                answerrArr[i] = answer.toUpperCase();
            } else {
                System.out.println("输入错误,请重新输入");
                i--;
            }
            if (i == 9) i--;
        }

    }

    /**
     * 判卷的方法
     */
    private void judgeExam() {
        for (int i = 0; i < answerrArr.length; i++) {
            if (answerrArr[i].equalsIgnoreCase(itemList.get(i).getAnswer())) {
                score += 10;
            }
        }
        String result = toString();
        System.out.println(result);
    }

    /**
     * 保存用户答案和成绩的方法
     */
    public void save() {
        File file = new File("Homework25/result.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.newLine();
            for (String answer : answerrArr) {
                writer.write(answer + ",");
            }
            writer.write(score.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印上次考试成绩的方法
     */
    public void printLastExam() {
        try {
            String line = "Homework25/result.txt";
            File file = new File(line);
            if (!file.exists()) {
                file.createNewFile();
            }
            String lastLine = readLastLine(line);

            if (!lastLine.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("上次考试答案为：[");
                String[] split = lastLine.split(",");
                for (int i = 0; i < split.length - 2; i++) {
                    sb.append(split[i]).append(", ");
                }
                sb.append(split[split.length - 2]).append("],上次考试的分数是:").append(split[split.length - 1]);
                System.out.println(sb);
            } else {
                System.out.println("尚未参加考试，请先考试!");
            }
        } catch (IOException e) {
            System.out.println("文件读取错误：" + e.getMessage());
        }

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("结果包含：[");
        for (int i = 0; i < answerrArr.length - 1; i++) {
            sb.append(answerrArr[i]).append(", ");
        }
        sb.append(answerrArr[answerrArr.length - 1]).append("]   得分:").append(score);
        return sb.toString();
    }

    public static String readLastLine(String filePath) throws IOException {
        try (RandomAccessFile randomFile = new RandomAccessFile(filePath, "r")) {
            long fileLength = randomFile.length() - 1;
            StringBuilder sb = new StringBuilder();
            for (long pos = fileLength; pos != -1; pos--) {
                pos = Math.max(pos, 0);
                randomFile.seek(pos);
                int readByte = randomFile.readByte();
                if (readByte == 0xd && pos == fileLength - 1) continue;
                if (sb.length() == 0 && readByte == 0xa) continue;
                if (readByte == 0xd || readByte == 0xa) break;
                sb.append((char) readByte);
            }
            return sb.reverse().toString();

        }
    }
}

