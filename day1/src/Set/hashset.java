package Set;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Honey {
    String name;
    Integer age;
    String shuxing;

    public Honey(String name, Integer age, String shuxing) {
        this.name = name;
        this.age = age;
        this.shuxing = shuxing;
    }

    @Override
    public String toString() {
        return "Honey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shuxing='" + shuxing + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Honey honey = (Honey) o;
        return Objects.equals(name, honey.name) && Objects.equals(age, honey.age) && Objects.equals(shuxing, honey.shuxing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, shuxing);
    }
}

public class hashset {
    public static void main(String[] args) {
        Set<Honey> Honey = new LinkedHashSet<>();
        Honey.add(new Honey("胡桃", 18, "火"));
        Honey.add(new Honey("神里凌华", 19, "冰"));
        Honey.add(new Honey("宵宫", 17, "火"));
        System.out.println(Honey);
    }
}
