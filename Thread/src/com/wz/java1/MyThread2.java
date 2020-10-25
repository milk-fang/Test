package com.wz.java1;

/**
 * 类描述
 *
 * @ClassName com.wz.java1.MyThread2
 * @Description TODO
 * @Author vip
 * @Date 2020/9/8 21:56
 * @Version 1.0
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if(i % 2 != 0){
                System.out.println("线程2:" + i);
            }
        }
    }
}
