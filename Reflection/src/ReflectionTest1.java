import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 类描述
 *
 * @ClassName ReflectionTest1
 * @Description TODO
 * @Author vip
 * @Date 2020/9/25 15:41
 * @Version 1.0
 */
public class ReflectionTest1 {

    @Test
    public void test01() throws Exception{

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(new File("hello.properties"));
        properties.load(fis);
        String user = properties.getProperty("user");
        String passwd = properties.getProperty("passwd");
        System.out.println("user = " + user +",passwd = " + passwd);
    }



    @Test
    public void test02() throws Exception{
        Class clazz = Class.forName("Person");
        Object o = clazz.getDeclaredConstructor().newInstance();
//        Person p = (Person) o;
        System.out.println(o);

        Class<Person> clazz1 = (Class<Person>) Class.forName("Person");
        Person person = clazz1.getDeclaredConstructor().newInstance();
        System.out.println(person);

        Class<Person> personClass = Person.class;
        Person zhaoge = personClass.getDeclaredConstructor(int.class, String.class).newInstance(18, "zhaoge");
        System.out.println(zhaoge);


    }

    @Test
    public void test03() throws Exception {
        Class clazz = Class.forName("Person");
        Field field = clazz.getDeclaredField("name");
        //设置发射时取消Java的访问检查，暴力访问
        field.setAccessible(true);
        Person p = (Person)clazz.getDeclaredConstructor().newInstance();
        field.set(p, "goulang");
        System.out.println(p);
        String name = (String)field.get(p);
        System.out.println(name);
    }


    @Test
    public void test04 () throws Exception{
        Class clazz = Class.forName("Person");
        Method method = clazz.getDeclaredMethod("show", String.class);
        method.setAccessible(true);
        Person p = (Person)clazz.getDeclaredConstructor().newInstance();
        method.invoke(p, "helloworld");
        System.out.println(p);
    }
}
