package day06;

/**
 * 可变参数
 * @author wang
 * @create 2019-12-09 17:12
 **/
@SuppressWarnings("all")
public class Demo14 {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
    }
    public static int add(int ...a){
        int sum = 0;
        for (int temp:a){
            sum += temp;
        }
        return sum;
    }
}
