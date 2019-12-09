package day01;

import java.util.Scanner;

@SuppressWarnings("all")
public class Demo04 {
    public static void main(String[] args) {
        //100-999中，每一位的立方的和等于其本身
        for (int i=100;i<1000;i++){
            int a = i%10;//个位数
            int b = i%100/10;//十位数00
            int c = i/100;//百位
            if (a*a*a+b*b*b+c*c*c == i)
                System.out.println(i);
        }
    }
}
