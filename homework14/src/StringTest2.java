import java.util.Random;

public class StringTest2 {
    public static void main(String[] args) {
        String str = randomString(10);
        System.out.println(str);
    }

    public static String randomString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    stringBuilder.append((char) (random.nextInt(26) + 65));
                    break;
                case 1:
                    stringBuilder.append((char) (random.nextInt(26) + 97));
                    break;
                case 2:
                    stringBuilder.append(random.nextInt(10));
                    break;
            }
        }
        return stringBuilder.toString();
    }
}
/*
 4，验证码生成
        在StringTest2类里编写一个 public static String randomString(int length) 方法, length是字符串的长度,randomString方法的作用是随机产生一个该长度的字符串,字符串里只能包含大写,小写字母以及数字. 在main方法里测试randomString方法的功能.
 */