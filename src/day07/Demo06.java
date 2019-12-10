package day07;

import java.io.*;

/**
 * 序列化对象
 * @author wangjj
 * @create 2019-12-10 10:18
 **/
@SuppressWarnings("all")
public class Demo06 {
    public static void main(String[] args) throws Exception {
        //1.创建序列化对象
        Person person = new Person("wang",21);
        //2.创建序列化输出流
        FileOutputStream fileOutputStream = new FileOutputStream("src/day07/testIO/person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //3.输出对象
        objectOutputStream.writeObject(person);
        //4.关闭流
        objectOutputStream.close();


        //1.创建反序列化流
        FileInputStream fileInputStream = new FileInputStream("src/day07/testIO/person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //2.读取对象
        Person obj = (Person) objectInputStream.readObject();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        //3.关闭流
        objectInputStream.close();
    }
}
