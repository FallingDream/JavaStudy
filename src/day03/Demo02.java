package day03;

import java.util.Scanner;

@SuppressWarnings("all")
public class Demo02 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";



        for (int i = 3;i > 0;i--){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String name = scanner.nextLine();
            System.out.println("请输入密码:");
            String pwd = scanner.nextLine();
            if (name.equals(username)&&pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                if (i==1){
                    System.out.println("次数耗尽，用户已锁定");
                }else {
                    System.out.println("登录失败，您还有"+(i-1)+"次机会");
                }
            }
        }
    }
}
