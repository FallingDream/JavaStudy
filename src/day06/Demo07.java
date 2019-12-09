package day06;

/**
 * 正则
 */
@SuppressWarnings("all")
public class Demo07 {
    public static void main(String[] args) {
        String str = "aaaaabc";
        String pattern = "^a+bc";
        System.out.println(str.matches(pattern));

        String phonenumber = "18852894745";
        String pattern1 = "1[3-9]\\d{9}";
        if (phonenumber.matches(pattern1)){
            System.out.println("手机号码格式正确");
        }else {
            System.out.println("手机号码格式不正确");
        }

        String name = "Rose  Jack    Tom Obama";
        String rule = " +";
        String[] strings = name.split(rule);
        for (String temp : strings) {
            System.out.println(temp);
        }
    }

}
