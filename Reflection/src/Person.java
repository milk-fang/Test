/**
 * 类描述
 *
 * @ClassName Person
 * @Description TODO
 * @Author vip
 * @Date 2020/9/25 15:49
 * @Version 1.0
 */
public class Person {
    private int age;
    private String name;

    public Person(){

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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

    private void show(String mes){
        System.out.println("I am a person! + " + mes);
    }
}
