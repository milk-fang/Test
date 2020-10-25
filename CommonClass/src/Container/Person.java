package Container;

/**
 * 类描述
 *
 * @ClassName Coll
 * @Description TODO
 * @Author vip
 * @Date 2020/9/18 19:07
 * @Version 1.0
 */
public class Person {
    private int age = 10;
    private String name = "haha";

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
