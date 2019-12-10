package day07;

import java.io.File;
import java.io.IOException;

/**
 * @author wangjj
 * @create 2019-12-10 8:40
 **/
@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/day07/testIO");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());

        //创建文件，要保证文件所在的路径存在
       /* file.createNewFile();
        file.delete();*/
        //mkdir 一次创建一个文件夹，mkdirs 一次创建多个文件夹

        //判断文件是否存在
        System.out.println(file.exists());
        //判断是否是文件
        System.out.println(file.isFile());
        //是否是文件夹
        System.out.println(file.isDirectory());

        File file1 = new File("src");
        //获取全部文件
        File[] files = file1.listFiles();
        for (File temp:files){
            System.out.println(temp.getName());
        }
    }
}
