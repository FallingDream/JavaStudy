package day04;
@SuppressWarnings("all")
public class Chinese extends Person{
    private String address;

    public Chinese(String name, int age){
        super(name,age);
        System.out.println("调用子类有参构造1");
    }
    public Chinese(String name, int age, String address) {
        this(name,age);
        this.address = address;
        System.out.println("调用子类有参构造2");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void test(){
        System.out.println(super.getName());
        System.out.println(super.getAge());
        System.out.println(this.getAddress());
    }
}
