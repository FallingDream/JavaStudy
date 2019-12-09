package day01;
@SuppressWarnings("all")
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15};
        //print(arr);
        //find(arr);
        Array();
    }
    static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void find(int[] arr){
        int temp = arr[0];
        for (int i=0;i<arr.length;i++){
           if (temp<arr[i]){
               temp = arr[i];
           }
        }
        System.out.println("最大数为"+temp);
    }
    static void Array(){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
