package day03;
@SuppressWarnings("all")
public class Demo03 {
    public static void main(String[] args) {
        String s = "helloworld";
        //1.字符串长度
        System.out.println(s.length());
        //2.获取指定索引位置的字符
        System.out.println(s.charAt(3));
        //3.获取指定字符第一次出现的索引位置
        System.out.println(s.indexOf("l"));
        //4.获取部分字符串
        System.out.println(s.substring(3));
        System.out.println(s.substring(4,8));
    }
}
