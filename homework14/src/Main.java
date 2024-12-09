public class Main {
    public static void main(String[] args) {
        String str = "    我 是 华 蓝 人, 我     爱     华    蓝!    ";
        System.out.println(str.replace(" ", ""));
        System.out.println("===================");
        int start = 0;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        int end = str.length() - 1;
        while (end > start && str.charAt(end) == ' ') {
            end--;
        }
        System.out.println(str.substring(start, end + 1));
        System.out.println("===================");
        String str2 = "username=zhangsan&password=123456&phone=18612345678";
        String[] str3 = str2.split("&");
        String[] str5 = {"用户名", "密码", "手机号"};
        for (int i = 0; i < str3.length; i++) {
            String[] str4 = str3[i].split("=");
            System.out.println(str5[i] + "=" + str4[1]);
        }
    }
}
/*1，去除空格
        有一个字符串"    我 是 华 蓝 人, 我     爱     华    蓝!    ",  编写代码去除字符串中的空格.
        2，去除两端空格
        有一个字符串"    我 是 华 蓝 人, 我     爱     华    蓝!    ",  编写代码去除字符串两端的空格（不要使用trim）.
        3，解析参数
        有一个字符串"username=zhangsan&password=123456&phone=18612345678", 编写代码分别打印出用户名,密码,和手机号.

*/