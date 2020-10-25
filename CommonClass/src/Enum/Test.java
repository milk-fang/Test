package Enum;

/**
 * 类描述
 *
 * @ClassName Test
 * @Description TODO
 * @Author vip
 * @Date 2020/9/17 16:50
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        EnumTry first = EnumTry.FIRST;
        System.out.println(first);

//        Enumnon enumnon = Enumnon.E;
        Enumnon e = Enumnon.E;
        System.out.println(e);
    }
}

enum Enumnon{
    A,B,C,D,E,F
}
