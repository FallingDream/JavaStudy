package day03;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用文件输入输出流实现文件的复制
 */
@SuppressWarnings("all")
public class Demo11 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/day03/Demo09.java");
            FileWriter fileWriter = new FileWriter("src/day03/testIO/copy.txt");

            int len = -1;
            char[] chars = new char[1024];
            while ((len = reader.read(chars))!=-1){
                fileWriter.write(chars,0,chars.length);
            }
            fileWriter.flush();
            fileWriter.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
