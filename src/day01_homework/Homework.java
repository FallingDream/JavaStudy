package day01_homework;

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("all")
public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;//班级总分
        int count = 0;//班级不及格人数

        //根据输出创建二维数组
        System.out.println("请输入班级总组数:");
        int arrX = scanner.nextInt();
        System.out.println("请输入每组的人数:");
        int arrY = scanner.nextInt();
        int[][] arr = new int[arrX][arrY];

        //录入随机成绩
        for (int i = 0;i<arrX;i++){
            for (int j = 0;j<arrY;j++){
                int grade = random.nextInt(101);
                arr[i][j] = grade;
            }
        }
        //按序输出
        for (int i = 0;i<arrX;i++){
            for (int j = 0;j<arrY;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


        double temp = -1;//单组最高平均分
        //嵌套循环输出每组不及格人数以及平均分
        for (int i = 0;i<arr.length;i++){
            //输出每组不及格人数
            //每次清零
            int count_group = 0;
            int sum_group = 0;
            for (int j = 0;j<arr[i].length;j++){
                if (arr[i][j]<60){
                    count_group++;
                    count++;
                }
                total+=arr[i][j];
                sum_group+=arr[i][j];
            }
            double ave = (double)sum_group/arr[i].length;//算得每组平均分
            System.out.println("第"+(i+1)+"组的不及格人数为:"+count_group);
            System.out.println("第"+(i+1)+"组平均分为:"+ave);
            if (temp<ave){
                temp = ave;
            }
        }
        System.out.println("班级中单组最高平均分为:"+temp);
        System.out.println("班级中不及格人数为:"+count);
        System.out.println("班级的平均分为:"+((double)total/(arr.length*arr[0].length)));
    }
}
