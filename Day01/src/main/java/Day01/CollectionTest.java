package Day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Hello"));
        Person person = new Person("CC",25);
        coll.add(person);
        coll.add(false);
        Collection coll1 = new ArrayList();
        coll1.add("晴天");
        coll1.add(123);
        coll.add(coll1);

        System.out.println(coll.size());

        System.out.println(coll.contains(123));   //数组coll中是否含有123
        System.out.println(coll.equals(coll1));   //数组coll和coll1是否相等
        coll.remove("Hello");                  //数组coll中删除Hello
        //coll.clear();                              //移除表中所有元素
        System.out.println(coll.isEmpty());      //数组coll是否空数组
        //迭代器输出数组中的内容
        Iterator it = coll.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }

        /**
         * jdk1.5 之后新增了foreach遍历  [增强for循环]
         * for(遍历的集合的数据类型  变量名：需要遍历的集合){
         *     使用
         * }
         */
        System.out.println("===============================");
        for(Object o:coll){
            System.out.println(o);
        }
    }
}
