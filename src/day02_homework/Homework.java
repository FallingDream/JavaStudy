package day02_homework;
@SuppressWarnings("all")
public class Homework {
    public static void main(String[] args) {
        //分别创建猫和狗的对象
        //猫使用构造方法赋值
        Cat cat = new Cat("花色","波斯猫");
        //狗使用无参构造方法，使用set方法赋值
        Dog dog = new Dog();
        dog.setColor("黑色");
        dog.setBreed("藏獒");
        //调用成员方法输出结果
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
