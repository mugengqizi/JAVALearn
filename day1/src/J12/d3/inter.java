package J12.d3;

interface Student {
    void eat();
}

class Lin implements Student {
    public void eat() {
        System.out.println("林忠爱吃shi");
    }
}

public class inter {
    public static void main(String[] args) {
        Lin LinZhong = new Lin();
        new Lin().eat();
    }
}

