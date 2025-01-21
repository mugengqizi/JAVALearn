package com.hualan.bean;

import java.util.Objects;

public class ExamItem {
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamItem examItem = (ExamItem) o;
        return Objects.equals(title, examItem.title) && Objects.equals(optionA, examItem.optionA) && Objects.equals(optionB, examItem.optionB) && Objects.equals(optionC, examItem.optionC) && Objects.equals(optionD, examItem.optionD) && Objects.equals(answer, examItem.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, optionA, optionB, optionC, optionD, answer);
    }

    @Override
    public String toString() {
        return
                title + '\n' +
                        optionA + '\n' +
                        optionB + '\n' +
                        optionC + '\n' +
                        optionD + '\n' +
                        answer + '\n'
                ;
    }
}