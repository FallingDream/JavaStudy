package day02;

@SuppressWarnings("all")
public class Demo09 {
    public static void main(String[] args) {
        Student banzhang = new Student("www",20);
        Student xiaoming = new Student("xiaoming",21);
        banzhang.study();
        System.out.println(banzhang.age);
        System.out.println(xiaoming.name);
    }
}
@SuppressWarnings("all")
class Student{
    String name;
    int age;
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


    Student(){
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void study(){
        System.out.println("正在学习...");
    }
    public void eat(){
        System.out.println("正在吃饭...");
    }
}
