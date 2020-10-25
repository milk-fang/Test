package Container;

import org.junit.Test;

import java.util.*;

/**
 * 类描述
 *
 * @ClassName CollectionTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/18 19:07
 * @Version 1.0
 */
public class CollectionTest {
    @Test
    public void test01(){
        Collection coll = new ArrayList<>();
        List<int[]> ints = Arrays.asList(new int[]{123, 456});
        System.out.println(ints.size());
        coll.remove(123);
//        coll.retainAll()

        Person[] p = new Person[5];
        for(int i = 0;i < 5;i++){
            p[i] = new Person();
        }

        for (Person person : p) {
            System.out.println(person);
        }
    }


    @Test
    public void test02(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);

    }


    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }
    private static void updateList(List list) {
        list.remove(new Person());

    }

    @Test
    public void testMap(){
        HashMap map = new HashMap();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");

        System.out.println(map);
        Set set = map.entrySet();
        System.out.println(set);

        for (Object obj:set) {
            Map.Entry obj1 = (Map.Entry) obj;
            System.out.println("键是：" + obj1.getKey() + ",值是：" + obj1.getValue());
        }
//        Collections.copy();
//        Collections.synchronizedCollection()

//        Collections.sort(list, new Comparator<Object>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        });
//        Collections.reverse;
//        Set s = new HashSet();
//        s.add("1");
//        s.add("2");
//        s.add("3");
//        s.add("4");
//        s.add("5");
//        System.out.println(s);
    }
}
