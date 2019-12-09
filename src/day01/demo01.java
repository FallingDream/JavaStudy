package day01;

import java.util.Scanner;

/**
 * 测试数据类型
 */
@SuppressWarnings("all")
public class demo01 {
    public static void main(String[] args) {
       /* int a = 1;
        int b = 2;
        int c = a>b?a:b;
        System.out.println(c);*/
       //sum();
       //isEqual();
       Large();
    }

    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数为:");
        int a = scanner.nextInt();
        System.out.println("第二个数为:");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("两个数之和为:"+c);
    }
    public static void isEqual(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数为:");
        int a = scanner.nextInt();
        System.out.println("第二个数为:");
        int b = scanner.nextInt();
        String back = a==b?"两数相等":"两数不等";
        System.out.println(back);
    }
    public static void Large(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数为:");
        int a = scanner.nextInt();
        System.out.println("第二个数为:");
        int b = scanner.nextInt();
        System.out.println("第三个数为:");
        int c = scanner.nextInt();
        int temp = a>b?a:b;
        temp = temp>c?temp:c;
        System.out.println("两个数中较大的数为:"+temp);
    }
}
