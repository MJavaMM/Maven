package Day01;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
    Set set = new HashSet();   //无法添加重复的数据
        set.add(123);
        set.add(456);
        set.add("AAA");
        set.add(123);
        set.add("BBB");
        System.out.println(set.size());
        for (Object o:set) {
        System.out.println(o);
    }
    }
}
