package day02;

import java.util.Scanner;

@SuppressWarnings("all")
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入六个分数:");
        int[] arr = new int[6];
        for (int i = 0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"名评委的分");
            arr[i] = scanner.nextInt();
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = sum(arr);
        double ave = (sum-min-max)/4.0;
        System.out.println("平均分为:"+ave);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static int sum(int[] arr){
        int total = 0;
        for (int i = 0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
}
