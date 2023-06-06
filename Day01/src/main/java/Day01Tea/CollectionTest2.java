package Day01Tea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
    public static void main(String[] args) {
        Collection coll= new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        Person p=new Person("Jerry",21);
        coll.add(p);
        coll.add(false);

        //拿到迭代器的对象
        //容易错误的方法一：
        //.NoSuchElementException 当前的不为空，返回打印的是下一个值，如果下一个没有值
        //出现  .NoSuchElementException 异常
       /* Iterator iterator = coll.iterator();
        while((iterator.next())!=null){
            System.out.println(iterator.next());
        }*/

        //容易错误的方法二   //重复输出第一个值
        /*while ((coll.iterator().hasNext())){
            System.out.println(coll.iterator().next());
        }*/


        /*正确的迭代器遍历*/
        /*Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }*/

        /*增强for循环遍历*/
        for (Object co : coll) {
            System.out.println(co);
        }


    }
}
