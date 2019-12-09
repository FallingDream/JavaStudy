package day02;
@SuppressWarnings("all")
public class Demo10 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("华为",4000,"黑色");
        p1.setBrand("苹果");
        p1.setPrice(6000);
        p1.setColor("白色");
        p1.phone("www");
        System.out.println(p1.getBrand());
        p2.sendMessage("aaa");
        System.out.println(p2.getBrand());
        p2 = p1;
        System.out.println(p2.getBrand());
        p1.setBrand("iphone");
        System.out.println(p1.getBrand());
        System.out.println(p2.getBrand());

    }
}
@SuppressWarnings("all")
class Phone{
    private String brand;
    private int price;
    private String color;
    Phone(){ }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    public void phone(String name){
        System.out.println("用"+brand+"手机给"+name+"打电话");
    }
    public void sendMessage(String name){
        System.out.println("用"+brand+"手机给"+name+"发短信");
    }
}