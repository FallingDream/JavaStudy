package day07;

/**
 * 多线程
 * @author wangjj
 * @create 2019-12-10 14:19
 **/
@SuppressWarnings("all")
public class Demo07 {
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        Thread thread1 = new Thread(myThread1);
        thread1.setName("thread1");
        MyThread myThread2 = new MyThread();
        Thread thread2 = new Thread(myThread2);
        thread2.setName("thread2");
        thread1.start();
        thread2.start();



    }
}
