package day02;
@SuppressWarnings("all")
public class Demo08 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int temp :
                arr) {
            System.out.print(temp+"\t");
        }
        System.out.println();
        reverse(arr);
        for (int temp :
                arr) {
            System.out.print(temp+"\t");
        }
    }
    public static void reverse(int[] arr){
        int startIndex = 0;
        int endIndex = arr.length-1;
        for (;startIndex<=endIndex;startIndex++,endIndex--){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
    }
}
