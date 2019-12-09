package day03;
@SuppressWarnings("all")
public class Demo07 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123456");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        stringBuilder.append("aaa");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
    }
}
