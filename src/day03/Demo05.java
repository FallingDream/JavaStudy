package day03;
@SuppressWarnings("all")
public class Demo05 {
    public static void main(String[] args) {
        String s = new String("123abcDEF");
        char[] chars = s.toCharArray();
        for (char temp : chars) {
            System.out.println(temp);
        }
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String s2 = new String(" 12356587 ");
        System.out.println(s2);
        System.out.println(s2.trim());
        String s3 = new String("1342,1223,4321");
        String[] strings = s3.split(",");
        for (String temp : strings) {
            System.out.println(temp);
        }
    }
}
