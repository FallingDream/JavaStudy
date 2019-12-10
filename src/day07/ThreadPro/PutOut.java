package day07.ThreadPro;

/**
 * 消费者
 * @author wangjj
 * @create 2019-12-10 15:56
 **/
@SuppressWarnings("all")
public class PutOut implements Runnable{
    private Person person;

    public PutOut(Person person) {
        this.person = person;
    }
    @Override
    public void run() {
        while (true){
            synchronized (person){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!person.isFlag()){
                    try {
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费了一个对象"+person.getName()+"---"+person.getSex());
                person.setFlag(false);
                person.notify();
            }
        }
    }
}
