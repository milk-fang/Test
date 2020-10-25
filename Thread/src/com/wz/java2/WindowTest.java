package com.wz.java2;

/**
 * 类描述
 *
 * @ClassName WindowTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/9 10:33
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
//        Thread thread = new Thread();
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");
        window1.start();
        window2.start();
        window3.start();
    }

}
