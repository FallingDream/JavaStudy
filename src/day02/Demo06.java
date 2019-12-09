package day02;
@SuppressWarnings("all")
public class Demo06 {
    public static void main(String[] args) {
        f(20);
    }
    public static void f(int n){
        int[] arr = new int[n];
        if (n==1|n==2){
            System.out.println("第"+n+"个月兔子的个数为:1");
        }else {
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2;i<arr.length;i++){
                arr[i] = arr[i-1]+arr[i-2];
            }
            System.out.println("第"+n+"个月兔子的个数为:"+arr[n-1]);
        }
    }
}
