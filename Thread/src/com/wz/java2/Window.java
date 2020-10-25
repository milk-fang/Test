package com.wz.java2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 类描述
 *
 * @ClassName Window
 * @Description TODO
 * @Author vip
 * @Date 2020/9/9 10:33
 * @Version 1.0
 */
public class Window extends Thread{
    private static int ticket = 100;
//    static Object obj = new Object();
    private static ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){

            lock.lock();
//            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(getName() + "还有余票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
                lock.unlock();
//            }
        }

    }
}
