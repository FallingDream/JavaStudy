package day07;

/**
 * 模拟卖票
 * @author wangjj
 * @create 2019-12-10 14:32
 **/
@SuppressWarnings("all")
public class Ticket implements Runnable{

    private int number = 100;

    private Object lock = new Object();
    @Override
    public void run() {
        synchronized (lock){
            while (true){
                if (number>0){
                    Thread thread = Thread.currentThread();
                    /*try {
                        thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println(thread.getName()+"正在售卖第"+(number--)+"张票");
                }else {
                    break;
                }
            }
        }


    }
}
