package day02;
@SuppressWarnings("all")
public class Demo02 {
    public static void main(String[] args) {
       //print();
        //printNum(10);
        printFlower();
    }
    public static void print(){
        int i = 0;
        while (i<10){
            System.out.println("Hello World!");
            i++;
        }
    }

    public static void printNum(int n){
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    public static void printFlower(){
        for (int i=100;i<1000;i++){
            int a = i%10;//个
            int b = i/10%10;//十
            int c = i/100;//百
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}
