package day07.ThreadPro;

/**
 * 生产消费
 * @author wangjj
 * @create 2019-12-10 15:49
 **/
@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) {
        Person person = new Person();

        PutIn putIn = new PutIn(person);
        PutOut putOut = new PutOut(person);

        Thread thread = new Thread(putIn);
        thread.start();
        Thread thread1 = new Thread(putOut);
        thread1.start();
    }
}
