package Day01Tea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList coll= new ArrayList();
        coll.add(123);
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        Person p=new Person("Jerry",21);
        coll.add(p);
        coll.add(false);
        //set(int index,Object o)  将o 放入在index的位置
        coll.set(1,"tt");
        System.out.println(coll);
        System.out.println("===========");
        System.out.println(coll.lastIndexOf(123));
        System.out.println("===========");

        //indexOf(object o) 返回集合中第一个数据索引位置
        System.out.println(coll.indexOf(123));
        System.out.println("===========");
        //get()获取指定位置的数据
        System.out.println(coll.get(1));

        System.out.println("===========");
        //add(int index,Object o)  将对象加入到指定的位置
        coll.add(0,"vv");
        Object clone = coll.clone();
        System.out.println(clone);
        System.out.println("===========");

        //size（）获取长度
        System.out.println("长度"+coll.size());
        Iterator it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
