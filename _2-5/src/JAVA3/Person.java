package JAVA3;

public class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Person person = new Person("胡桃", 18);
        Person person1 = new Person();
        person1.setName("芬妮");
        person1.setAge(18);
        System.out.println(person);
        System.out.println(person1);
    }
}
