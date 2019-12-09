package day03;

import java.util.ArrayList;
import java.util.Scanner;

import static day03.DemoUtil.*;

@SuppressWarnings("all")
public class StudentDemo {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        String filename = "src/day03/studentinfo.txt";
        while (true){
            readData(filename);
            Scanner scanner = new Scanner(System.in);
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1  添加学生信息");
            System.out.println("2  删除学生信息");
            System.out.println("3  修改学生信息");
            System.out.println("4  查看学生信息");
            System.out.println("5  退出");
            System.out.println("请输入您的选择:");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":addStudent(arrayList);break;
                case "2":removeStudent(arrayList);break;
                case "3":updateStudent(arrayList);break;
                case "4":getStudent(arrayList);break;
                case "5":
                    System.out.println("感谢您的使用");System.exit(0);break;
                default:
                    System.out.println("请输入正确的选项!");
                    break;
            }
        }
    }
}
