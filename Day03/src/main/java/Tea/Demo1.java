package Tea;

import java.util.ArrayList;
import java.util.List;

/*
* 包装类：
*       为什么使用它？
*               ①在使用泛型的时候可以使用
*               ②首先是个类，就会有属性和方法给我们使用
*
*       基本数据类型          包装类
*       byte                Byte
*       short               Short
*       int     ----->      Integer
*       long                Long
*       float                Float
*       double              Double
*       char    ----->      Character
*       boolean             Boolean
*
*   除了Character类是只有对应的基本数据类型作为参数之外，其他的包装类都是有其对应的基本数据类型作为参数和StringL类型作为参数
*   Boolean类型的包装类的参数是String类型的时候，不区别大小写只要是true结果就是true,其他情况都是false.
*   当包装类中传入的参数是null的时候，编译没有问题，运行的时候出现NullPointerException  异常
*
*
* */


public class Demo1 {
    public static void main(String[] args) {
       //将包装类作为泛型放入集合限制中
        List<Integer> list = new ArrayList();
        list.add(123);

        Integer i1 = new Integer(12);
        Integer i2=new Integer("123");
        //Integer i2=new Integer("asd");
        Double d1 = new Double(12.1);
        Double d2= new Double("12.1");
        //Double d2= new Double(null);
        Boolean b1 = new Boolean(false);
        Boolean b2=new Boolean(null);
        //。。。。
        Character c1 = new Character('a');
        //Character c2 = new Character("r");
        System.out.println(i1+" ,"+i2+","+d1+","+d2+","+c1+","+b1+","+b2);


    }
}
