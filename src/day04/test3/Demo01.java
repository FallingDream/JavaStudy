package day04.test3;

public class Demo01  {
    public static void main(String[] args) {
        Chinese rose = new Chinese();
        System.out.println(rose.country);
        Chinese.country = "美国";
        Chinese jack = new Chinese();
        System.out.println(jack.country);
    }
}
