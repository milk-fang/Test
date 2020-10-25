package com.wz.java1;

/**
 * 类描述
 *
 * @ClassName com.wz.java1.MyThread
 * @Description 我的线程类
 * @Author vip
 * @Date 2020/9/8 21:49
 * @Version 1.0
 */
public class MyThread extends Thread{
    //线程创建：
    //1.继承Thread类

    //2.在类里重写run方法


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if(i % 2 == 0){
                System.out.println("线程1：" + i);
            }
        }
    }

    //3.在主方法里创建对象

    //4.对象.start();
}
