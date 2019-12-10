package day07;

/**
 * 线程
 * @author wangjj
 * @create 2019-12-10 14:19
 **/
@SuppressWarnings("all")
public class MyThread implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        for (int i = 0;i<50;i++){
            System.out.println(thread.getName()+"---"+i);
        }
    }
}
