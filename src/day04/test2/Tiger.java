package day04.test2;
@SuppressWarnings("all")
public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("老虎喜欢吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("躺在地上睡觉");
    }
}
