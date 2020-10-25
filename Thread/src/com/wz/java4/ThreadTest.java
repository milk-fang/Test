package com.wz.java4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 类描述
 *
 * @ClassName ThreadTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/11 11:36
 * @Version 1.0
 */

class MyCall implements Callable {

    @Override
    public Object call() throws Exception {
        for(int i = 0; i < 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() +":" + i);
            }
        }
        return "haha";
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        MyCall myCall = new MyCall();
//    new void Thread(new FutureTask(myCall)).start()

        FutureTask futureTask = new FutureTask(myCall);
//    Thread thread = new Thread(futureTask);
//
//    thread.start();
        new Thread(futureTask).start();

        try {
            String o = (String)futureTask.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
