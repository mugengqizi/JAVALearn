package neibu;

interface Ni {
    void ni(String a);
}

interface NMi {
    String nmi(String a, String b);

}

class NiMing {
    public static void main(String[] args) {
        Ni cat = new Ni() {
            @Override
            public void ni(String a) {
                System.out.println("玩个蛋");
            }

        };
        cat.ni("qwe");

        Ni c2 = a -> System.out.print(a);
        c2.ni("林忠");
        NMi c3 = (a, b) -> a + b;
        System.out.println("穿" + c3.nmi("黑丝", "白丝"));
    }

}