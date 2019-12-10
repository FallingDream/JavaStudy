package day07;


import java.io.Serializable;

/**
 * 序列化
 * @author wangjj
 * @create 2019-12-10 10:42
 **/
@SuppressWarnings("all")
public class Person implements Serializable {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
