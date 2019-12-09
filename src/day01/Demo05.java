package day01;

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("all")
public class Demo05 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true){
            if (count<5){
                System.out.println("请输入数字:");
                int myNum = scanner.nextInt();
                if (myNum>num)
                    System.out.println("猜大了");
                else if (myNum<num)
                    System.out.println("猜小了");
                else{
                    System.out.println("猜对了,您共用了"+(count+1)+"次");
                    break;
                }
                count++;
            }else {
                System.out.println("对不起，您的次数已用光");
                break;
            }

        }
    }
}
