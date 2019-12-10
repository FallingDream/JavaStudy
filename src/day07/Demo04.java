package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 字节输出流
 * @author wangjj
 * @create 2019-12-10 9:45
 **/
@SuppressWarnings("all")
public class Demo04 {
    public static void main(String[] args) throws Exception {
       /* FileOutputStream fileOutputStream = new FileOutputStream("src/day07/testIO/test.txt");
        fileOutputStream.write(97);
        fileOutputStream.close();*/
        FileInputStream fileInputStream = new FileInputStream("src/day07/testIO/test.txt");
        //一次读取一个字节
        /*int ch  = -1;
        while ((ch = fileInputStream.read()) != -1){
            System.out.println((char)ch);
        }*/

        byte[] bytes = new byte[1024];
        int length = -1;
        while((length = fileInputStream.read(bytes))!=-1){
            System.out.print(new String(bytes,0,length-1));
        }

    }
}
