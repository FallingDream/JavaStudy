package day03_homework;

import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Homework {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src/day03_homework/test.txt"));
            String str = null;
            ArrayList<String> list = new ArrayList<String>();
            while ((str = br.readLine())!=null){
                list.add(str);
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("src/day03_homework/test.txt"));
            for (int i = list.size()-1;i>=0;i--){
                bw.write(list.get(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
