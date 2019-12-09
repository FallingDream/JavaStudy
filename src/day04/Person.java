package day04;
@SuppressWarnings("all")
public class Person {
    private String name;
    private int age;
    public void eat(){
        System.out.println("正在吃饭...");
    }
    public void sleep(){
        System.out.println("正在睡觉...");
    }

    public Person() {
        System.out.println("调用父类空参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用父类有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
