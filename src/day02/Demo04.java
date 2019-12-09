package day02;
@SuppressWarnings("all")
public class Demo04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+"\tb:"+b);
        change(a,b);
        System.out.println("a:"+a+"\tb:"+b);
        int[] arr = {1,2,3,4,5};
        for (int temp : arr) {
            System.out.print(temp+"\t");
        }
        System.out.println();
        changeArr(arr);
        for (int temp : arr) {
            System.out.print(temp+"\t");
        }
    }
    public static void change(int a,int b){
        a = a+b;
        b = a+b;
        System.out.println("a:"+a+"\tb:"+b);
    }
    public static void changeArr(int[] arr){
        for (int i = 0;i<arr.length;i++) {
            if (arr[i]%2==0){
                arr[i] = arr[i]*2;
            }
        }
    }

}
