package neibu;

public class Nei {
}

class Out {
    private String name;
    private Integer age;

    public Out() {
    }

    public Out(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("外部");
    }

    class Int {
        private String sex;

        public Int() {
        }

        public Int(String sex) {
            this.sex = sex;
        }

        public void say() {
            System.out.println("内部");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Out.Int in = new Out().new Int("nv");
        
        in.say();
    }
}
