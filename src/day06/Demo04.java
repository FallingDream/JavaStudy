package day06;

import java.util.Scanner;

@SuppressWarnings("all")
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        if (age<18){
            U18Exception u18Exception = new U18Exception("年龄小于18岁");
            try {
                throw u18Exception;

            } catch (U18Exception e) {
                System.out.println("不满足要求");
                e.printStackTrace();
            }
        }

    }
}
