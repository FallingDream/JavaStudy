package day04;
@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.setName("王");
        coder.setAge(21);
        System.out.println(coder.getName()+coder.getAge());
        coder.eat();
        coder.sleep();
        coder.code();
    }
}
