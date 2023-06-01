package Day01Tea;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(123);
        list.add(456);
        list.add("abc");
        list.addFirst("BB");
        list.addLast("XX");
        for(Object o:list){
            System.out.println(o);
        }
    }
}
