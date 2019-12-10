package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 字节流复制文件
 * @author wangjj
 * @create 2019-12-10 10:00
 **/
@SuppressWarnings("all")
public class Demo05 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/day07/testIO/1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src/day07/testIO/2.txt");

        //通过读取单个字节复制
        /*int ch = -1;
        while ((ch = fileInputStream.read())!=-1){
            fileOutputStream.write((char)ch);
        }*/

        //通过字节数组复制
        byte[] bytes = new byte[1024];
        int length = -1;
        while ((length = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,length-1);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}
