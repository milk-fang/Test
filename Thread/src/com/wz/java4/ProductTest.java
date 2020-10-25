package com.wz.java4;


//生产者消费者模型

import java.util.concurrent.Callable;

/**
 * 类描述
 *
 * @ClassName ProductTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/10 14:27
 * @Version 1.0
 */

class Cleck{

    private int product = 0;
    //生产产品
    public synchronized void produceProduct() {
        if(product < 20){
            product ++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + product + "件产品");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消费产品
    public synchronized void consumeProduct() {
        if(product > 0){
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + product + "件产品");
            product --;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Producer extends Thread{
    private Cleck cleck;

    public Producer(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public synchronized void run() {
        System.out.println(getName() + ":开始生产产品......");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cleck.produceProduct();
        }
    }
}

class Consumer extends Thread{
    private Cleck cleck;

    public Consumer(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public synchronized void run() {
        System.out.println(getName() + "开始消费产品......");
        while(true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.consumeProduct();
        }

    }
}
public class ProductTest {

    public static void main(String[] args) {
        Cleck cleck = new Cleck();
        Producer producer = new Producer(cleck);
        Consumer consumer = new Consumer(cleck);
        producer.setName("生产者1");
        consumer.setName("消费者1");
        producer.start();
        consumer.start();
    }
}
