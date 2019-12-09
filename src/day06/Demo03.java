package day06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("all")
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        FileWriter fileWriter = null;
        try {
            fileWriter.write(path);

        } catch (IOException e) {
            System.out.println("产生了IO异常");
            e.printStackTrace();
        }finally {
            System.out.println("关闭IO流");
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
