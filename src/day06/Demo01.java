package day06;

import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) {
        //int a = 1/0;
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day06.Demo01.main(Demo01.java:5)
         */
        try {
            int a = 1/0;
            System.out.println(a);
            FileReader reader = new FileReader("a.txt");
            reader.read();
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("IO流报错");
            e.printStackTrace();
        }

    }
}
