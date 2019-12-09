package day02;

import java.util.Scanner;

@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int fn = scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int sn = scanner.nextInt();
        System.out.println("和为:"+demo01.add(fn,sn));
    }

    public int add(int a,int b){
        int sum = a+b;
        return sum;
    }
}
