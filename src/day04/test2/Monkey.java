package day04.test2;
@SuppressWarnings("all")
public class Monkey extends Animal{

    @Override
    public void eat() {
        System.out.println("猴子喜欢吃香蕉");
    }

    @Override
    public void sleep() {
        System.out.println("躺在树上睡觉");
    }
}
