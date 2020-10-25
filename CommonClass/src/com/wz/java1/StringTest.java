package com.wz.java1;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * 类描述
 *
 * @ClassName StringTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/11 12:16
 * @Version 1.0
 */
public class StringTest {
    @Test
    public void test(){
//        System.out.println("haha");

        System.out.println(System.currentTimeMillis());
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.intern() == s2);
        StringBuilder builder = new StringBuilder(50);
        System.out.println(System.currentTimeMillis());
    }
    @Test
    public void test2(){
//        Date date1 = new Date();
//        System.out.println(date1);
//        System.out.println(date1.getTime());
        Calendar instance = Calendar.getInstance();
        int days = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
