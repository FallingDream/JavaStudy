package day03;

import java.util.Scanner;

@SuppressWarnings("all")
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String s = scanner.nextLine();
        char ch;
        int count_lowercase = 0;
        int count_uppercase = 0;
        int count_num = 0;
        for (int i = 0; i<s.length();i++){
            ch = s.charAt(i);
            if (ch>='A'&&ch<='Z')count_uppercase++;
            else if (ch>='a'&&ch<='z')count_lowercase++;
            else if (ch>='0'&&ch<='9')count_num++;
        }
        System.out.println("大写字母有:"+count_uppercase+"个");
        System.out.println("小写字母有:"+count_lowercase+"个");
        System.out.println("数字有:"+count_num+"个");
    }
}
