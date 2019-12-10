package day07.ThreadPro;

/**
 * 生产者
 * @author wangjj
 * @create 2019-12-10 15:51
 **/
@SuppressWarnings("all")
public class PutIn implements Runnable{
    //对象锁
    private Person person;

    public PutIn(Person person) {
        this.person = person;
    }
    int i = 0;
    @Override
    public void run() {
        while (true){
            synchronized (person){

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //使用标志位来判断是否生产，如果已生产则进入等待状态
                if (person.isFlag()){
                    try {
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //如果未生产则生产对象
                if (i%2==0){
                    person.setName("wang");
                    person.setSex("nan");
                }else {
                    person.setName("zhang");
                    person.setSex("nv");
                }
                System.out.println("生产了一个对象"+person.getName()+"---"+person.getSex());
                //生产完成后将标志位置为true，表示已有对象
                person.setFlag(true);
                //生产后唤醒消费者
                person.notify();
            }
            i++;
        }

    }
}
