package day03;

import java.io.*;

/**
 * 使用缓冲流实现文件复制
 */
@SuppressWarnings("all")
public class Demo12 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/day03/Demo09.java"));
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/day03/testIO/copy.txt"));
            String str = null;
            while ((str = br.readLine())!=null){
                bw.write(str);
                //换行
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
