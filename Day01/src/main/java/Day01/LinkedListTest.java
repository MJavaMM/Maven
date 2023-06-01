package Day01;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(123);
        list.add(456);
        list.add("abc");
        list.addFirst("BB");
        list.addLast("XX");
        for(Object o:list){      //有顺序
            System.out.println(o);
        }
    }
}
