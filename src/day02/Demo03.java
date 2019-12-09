package day02;
@SuppressWarnings("all")
public class Demo03 {
    public static void main(String[] args) {
        sum(1,3);
        sum(1.1,3.3);
        sum(1,2,3);
    }
    public static void sum(int a,int b){
        System.out.println(a+b);

    }
    public static void sum(double a,double b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
