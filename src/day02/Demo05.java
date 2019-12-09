package day02;

import java.util.Scanner;

@SuppressWarnings("all")
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("请输入月份:");
        int month = scanner.nextInt();
        season(month);*/
        printNum();
    }
    public static void season(int month){
        switch (month){
            case 1:
                System.out.println("冬季");break;
            case 2:
                System.out.println("冬季");break;
            case 3:
                System.out.println("春季");break;
            case 4:
                System.out.println("春季");break;
            case 5:
                System.out.println("春季");break;
            case 6:
                System.out.println("夏季");break;
            case 7:
                System.out.println("夏季");break;
            case 8:
                System.out.println("夏季");break;
            case 9:
                System.out.println("秋季");break;
            case 10:
                System.out.println("秋季");break;
            case 11:
                System.out.println("秋季");break;
            case 12:
                System.out.println("冬季");break;
                default:
                    System.out.println("请输入正确的月份");break;
        }
    }
    public static void printNum(){
        for (int i = 10000;i<100000;i++){
            int a = i%10;//个
            int b = i/10%10;//十
            int c = i/100%10;//百
            int d = i/1000%10;//千
            int e = i/10000;//万
            if (a==e&&b==d){
                System.out.println(i);
            }
        }
    }
}
