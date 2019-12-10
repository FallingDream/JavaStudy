package day07;

import java.io.File;

/**
 * 使用递归打印所有文件路径
 * @author wangjj
 * @create 2019-12-10 9:12
 **/
@SuppressWarnings("all")
public class Demo03 {
    public static void main(String[] args) {
        File file = new File("src");
        showFile(file);
    }
    public static void showFile(File file){
        File[] files = file.listFiles();
        for (File temp:files){
            if (temp.isFile()){
                System.out.println(temp.getPath());
            }else {
                showFile(temp);
            }
        }
    }

}
