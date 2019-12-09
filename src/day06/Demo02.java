package day06;
@SuppressWarnings("all")
public class Demo02 {
    public static void main(String[] args) {
        try {
            int a = 1/0;
        }catch (Exception e){
            System.out.println("除数不能为0");
        }
        System.out.println("后面的代码");
    }
}
