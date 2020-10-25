package com.wz.java3;

/**
 * 类描述
 *
 * @ClassName MThread
 * @Description TODO
 * @Author vip
 * @Date 2020/9/9 11:46
 * @Version 1.0
 */
public class MThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
