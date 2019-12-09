package day03;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("all")
public class DemoUtil {
    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = scanner.nextLine();
        Boolean flag = true;
        for (int i = 0;i<list.size();i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("请输入学生姓名");
            String name = scanner.nextLine();
            System.out.println("请输入学生年龄");
            String age = scanner.nextLine();
            System.out.println("请输入学生地址");
            String address = scanner.nextLine();
            Student student = new Student(id,name,age,address);

            list.add(student);
        }else {
            System.out.println("学生信息已存在，请重新选择");
        }
    }
    //查询学生
    public static void getStudent(ArrayList<Student> list){
        System.out.println("学生信息");
        for (int i = 0;i<list.size();i++){
            System.out.println("-----------");
            System.out.println("ID:"+list.get(i).getId());
            System.out.println("姓名:"+list.get(i).getName());
            System.out.println("年龄:"+list.get(i).getAge());
            System.out.println("地址:"+list.get(i).getAddress());
        }
    }
    //删除学生
    public static void removeStudent(ArrayList<Student> list){
        System.out.println("请输入要删除的学号:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0;i<list.size();i++){
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag){
            list.remove(index);
            System.out.println("学生信息已删除");
        }else {
            System.out.println("学生信息不存在!!");
        }
    }
    //修改学生信息
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("请输入要修改的学号:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Boolean flag = false;
        int index = 0;
        for (int i = 0;i<list.size();i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag){
            System.out.println("请输入学生姓名");
            String name = scanner.nextLine();
            System.out.println("请输入学生年龄");
            String age = scanner.nextLine();
            System.out.println("请输入学生地址");
            String address = scanner.nextLine();
            Student student = new Student(id,name,age,address);
            list.set(index,student);
        }else {
            System.out.println("学生信息不存在");
        }
    }
    //写数据
    public static void writeData(String filename,ArrayList<Student> list){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            for (int i = 0;i<list.size();i++){
                Student student = list.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append(student.getId()).append(",").
                        append(student.getName()).append(",").
                        append(student.getAge()).append(",").
                        append(student.getAddress());
                bw.write(sb.toString());
                bw.newLine();
                bw.flush();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //读数据
    public static ArrayList<Student> readData(String filename){
        ArrayList<Student> list = new ArrayList<Student>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String info = null;
            while ((info = br.readLine())!=null){
                String[] data = info.split(",");
                Student student = new Student();
                student.setId(data[0]);
                student.setName(data[1]);
                student.setAge(data[2]);
                student.setAddress(data[3]);
                list.add(student);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
