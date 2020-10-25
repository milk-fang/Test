package com.wz.java3;

/**
 * 类描述
 *
 * @ClassName ThreadTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/9 11:46
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        MThread mThread = new MThread();
        new Thread(mThread).start();
        new Thread(mThread).start();
        new Thread(mThread).start();
    }
}