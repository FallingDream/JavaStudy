package day03;
@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = "hello";
        String s4 = "HELLO";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        //比较值是否相同
        System.out.println(s1.equals(s2));
        //忽略大小写
        System.out.println(s1.equalsIgnoreCase(s4));
        //以指定字符串开始与结尾
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.startsWith("e"));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.endsWith("h"));

    }
}
