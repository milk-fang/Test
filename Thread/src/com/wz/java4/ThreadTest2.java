package com.wz.java4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 类描述
 *
 * @ClassName ThreadTest2
 * @Description TODO
 * @Author vip
 * @Date 2020/9/11 11:48
 * @Version 1.0
 */
class MyPool implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i < 100;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor myservice = (ThreadPoolExecutor) service;
//        myservice.setCorePoolSize();

        myservice.execute(new MyPool());
        myservice.shutdown();
    }
}
