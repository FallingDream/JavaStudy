package day07;

import java.util.concurrent.Callable;

/**
 * @author wangjj
 * @create 2019-12-10 14:59
 **/
@SuppressWarnings("all")
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread()+"---线程返回结果";
    }
}
