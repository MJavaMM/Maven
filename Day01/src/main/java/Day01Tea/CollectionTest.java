package Day01Tea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*   之前存储数据使用的技术：变量-->数组--->集合框架
*    数组特点：
*          在内存中开辟的空长度一旦声明就不会改变；
*           在数组中存储的数据类型是固定的
*           可以存储连续的较多的数据
*       不足：
*           数组的长度一旦声明不可以改变。
*           数据类型声明之后不可以存储其他数据类型的值
*           所有的增加删除等操作都需要我们自己完成
*
*       集合框架：Collection
*           Collection
*               List
*                   ArrayList:   有序的可重复的【动态数组】。在我们执行add()方法的时候，会自动的创建一个长度为10的空间数组，
*                                   如果不够用则会默认扩容1.5倍的空间。
*                                   效率高，线程不安全
*                   LinkedList: 底层是双向链表的形式存储数据，针对增加 删除频繁的可以选择，不可重复无序。效率高，线程不安全
*                   Vector:   古老的实现类，效率低，线程安全
*               Set
*                   HashSet :不可重复，无序。
*                           无序：值存放数据的位置是无序，但是我们打印数据的时候是按照既定的放好的顺序打印
*                             set中add一个内容的时候，会通过hashCode,根据这个值找到需要存放的位置，如果这个
*                               位置是个空位置则新增成功
*                               如果这个位置有值，重写equals,返回true,则新增失败，反之新增成功
*                   TreeSet:有序，可重复
*
*
* Collection的常用方法有哪些？【见API】
*
*
*
*
* */
public class CollectionTest {
    /*
    * add(E e); 向集合中加入数据
    *size()  查看数据的长度【个数】
    *equals()比较两个对象[集合]是否相等
    * isEmpty()判断是否为空
    * clear()清空集合中的内容
    * addAll(Collection e)  将集合e添加到集合中
    * remove()从集合中移除摸个数据
    * contains（）是否包含某个对象
    *
    *
    * 数据结构
    *   栈
    *       存储数据特点：先进的后出，后进的先出
    *
    *   队列
    *       存储数据特点：先进先出，后进后出
    *
    *   数组
    *         先开辟一连串的空间存储数据，先找到数组的地址值，然后根据数组的下标找到对应的具体某个值
    *         存储数据新增和删除效率比较低，需要我们的去移动相关数据
    *          查询数据较方便
    *   链表
    *       单向链表：
    *               新增和删除效率比较高
    *               查询比较慢
    *       双向链表：
    *              相对于单向链表查询较快，但是相对数组的查询还是慢的
    *
    *
    * */
    public static void main(String[] args) {
        Collection coll= new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        Person p=new Person("Jerry",21);
        coll.add(p);
        coll.add(false);

        Collection coll1= new ArrayList();
        coll1.add(123);
        coll1.add("aa");

        coll.addAll(coll1);


        System.out.println(coll.size());
        System.out.println(coll.equals(coll1));
       // coll.clear();
        System.out.println(coll.isEmpty());
        //遍历集合中的数据   迭代器遍历
        Iterator it = coll.iterator();
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
        //不常用
       /* for (int i = 0; i <coll.size() ; i++) {
            System.out.println(it.next());
        }*/
        /*
        *  推荐使用
        * 原理：在第一个数值之上有个指针，通过hasNext方法判断下一个是否有值，有值则向下挪动指针返回当前值
        *       下一个如果没有值则结束
        * */
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("========================");
        /**
         * jdk1.5 之后新增了foreach遍历  [增强for循环]
         * for(遍历的集合的数据类型  变量名：需要遍历的集合){
         *     使用
         * }
         */


        /**/
        boolean contains = coll.contains(456);
        System.out.println("是否包含1："+contains);
        boolean remove = coll.remove(123);
        System.out.println("是否包含2："+contains);
        System.out.println("是否删除成："+remove);
        System.out.println("=============");
        for(Object o:coll){
            System.out.println(o);
        }


    }

}
