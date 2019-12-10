package day07;

import java.util.Scanner;

/**
 * 递归求阶乘
 * @author wangjj
 * @create 2019-12-10 9:03
 **/
@SuppressWarnings("all")
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入阶乘数");
        int n = scanner.nextInt();
        System.out.println(test(n));
    }

    public static int test(int n){
        if (n==1){
            return 1;
        }
        return n*test(n-1);
    }


}
