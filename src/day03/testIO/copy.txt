package day03;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 写入文件
 */
@SuppressWarnings("all")
public class Demo09 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src/day03/testIO/test01.txt");
            String str = "abcdefg";
            char[] chars = str.toCharArray();

            //写字符串
            fileWriter.write("123456");
            fileWriter.flush();
            //写字符数组
            fileWriter.write(chars);
            fileWriter.flush();
            //写字符数组的一部分
            fileWriter.write(chars,2,3);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
