package com.wz.java1;

/**
 * 类描述
 *
 * @ClassName com.wz.java1.ThreadTest
 * @Description 线程测试
 * @Author vip
 * @Date 2020/9/8 21:49
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("HELLO WORLD");

        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
