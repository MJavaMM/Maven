package Tea;



/*
xxValue();
* 将一个包装类  转换为对应的基本数据类型
valueOf:
    将其对应的基本数据类型转换为对应的包装类
 parseInt()将字符串转换为基本数据类型
*
* */
public class Demo2 {
    public static void main(String[] args) {
/*      Integer i1 = new Integer(123);
        int i = i1.intValue();
        Double d=new Double(12.5);
        double v = d.doubleValue();
        int n=12;

        Character c= new Character('a');
        Character v1 = Character.valueOf('v');

       //转换为基本数据类型
        int abc = Integer.parseInt("abc");

        System.out.println(i);
        //包装类
        Integer i3=12;
        //拆箱
        int i4=i3;
        int n1=20;
        //装箱
        Integer n2=n1;*/

        Double aDouble = Double.valueOf("abc");
        System.out.println(aDouble);

    }
}
