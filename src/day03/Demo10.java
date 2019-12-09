package day03;

import java.io.FileReader;

/**
 * 读取文件
 */
@SuppressWarnings("all")
public class Demo10 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/day03/Demo09.java");
            /*int ch;
            while ((ch=reader.read())!=-1){
                System.out.print((char) ch);
            }*/
            int len = -1;
            char[] arr = new char[1024];
            while ((len = reader.read(arr))!= -1)
                System.out.println(new String(arr,0,arr.length));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
