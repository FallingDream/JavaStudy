package day04.test2;
@SuppressWarnings("all")
public class Demo {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Tiger tiger = new Tiger();
        Monkey monkey1 = (Monkey) test2(monkey);
        test(monkey1);
        Tiger tiger1 = (Tiger) test2(tiger);
        test(tiger1);
    }
    //多态
    public static void test(Animal animal){
        System.out.println(animal.getId()+animal.getName());
        animal.eat();
        animal.sleep();
    }
    //instanceof 判断对象是否是某种数据类型
    //将animal对象返回
    public static Animal test2(Animal animal){
        if (animal instanceof Monkey){
            animal.setId("1");
            animal.setName("猴子");
        }else if (animal instanceof Tiger){
            animal.setId("2");
            animal.setName("老虎");
        }
        return animal;
    }
}
