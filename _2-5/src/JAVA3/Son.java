package JAVA3;

public class Son extends Person {
    private String sex;

    public Son(String sex) {
        this.sex = sex;
    }

    public Son(String name, Integer age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name=" + getName() + '\'' +
                "age=" + getAge() + '\'' +
                "sex=" + sex + '\'' +
                '}';
    }
}

class Test1 {
    public static void main(String[] args) {
        Person son1 = new Son("丽芙", 18, "女");
        System.out.println(son1);
    }
}
