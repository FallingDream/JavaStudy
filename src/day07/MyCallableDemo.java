package day07;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author wangjj
 * @create 2019-12-10 15:01
 **/
@SuppressWarnings("all")
public class MyCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyCallable myCallable = new MyCallable();
        Future<String> submit = executorService.submit(myCallable);
        System.out.println(submit.get());
    }
}
