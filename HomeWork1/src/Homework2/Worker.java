package Homework2;

import java.util.Objects;

public class Worker {
    String name;
    Integer age;
    double salary;

    public Worker() {
    }

    public Worker(String name, Integer age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "姓名为：'" + name + '\'' +
                ", 年龄为：" + age +
                ", 工资为：" + salary +
                '}';
    }

    public void work() {
        System.out.println(name + "在工作");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.salary, salary) == 0 && Objects.equals(name, worker.name) && Objects.equals(age, worker.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
