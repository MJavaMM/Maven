package Demo01;

public class Demo02 {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(12);   //将其对应的基本数据类型转换为对应的包装类
        int i = integer.intValue();                //将一个包装类  转换为对应的基本数据类型

        int abc = Integer.parseInt("234");      //parseInt()将字符串转换为基本数据类型


    }
}
