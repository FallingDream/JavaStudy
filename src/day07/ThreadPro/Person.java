package day07.ThreadPro;

/**
 * @author wangjj
 * @create 2019-12-10 15:49
 **/
@SuppressWarnings("all")
public class Person {
    private String name;
    private String sex;
    //标志位
    boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
