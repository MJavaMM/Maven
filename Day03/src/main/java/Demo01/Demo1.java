package Demo01;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        Integer i1 = new Integer(123);
        Integer i2 = new Integer("123");

        Double d1 = new Double(11.1);
        Double d2 = new Double("11.1");

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(null);

        Character c1 = new Character('a');


        System.out.println(i1+","+i2+","+d1+","+d2+","+b1+","+b2+","+c1);
    }
}
