package tea;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestPerson {
    /*
    *   使用反射的方法获取类的公开的和私有的属性  方法  构造方法赋值
    *
    *
    * */

    public static void main(String[] args) throws Exception {
        //没有使用反射的情况
       /* Person person = new Person();
        person.age=10;
        person.show();*/

        /*通过构造方法赋值*/
        //获取一个类的实例
        Class clazz = Person.class;
        Constructor constructor = clazz.getConstructor(int.class, String.class);
        Object tom = constructor.newInstance(21, "Tom");// Person p = new Person();
        Person person = (Person)tom;
        System.out.println(person);
        /*通过制定的属性和方法赋值*/
        //获取公开的属性属性
        Field age = clazz.getField("age");
        age.set(person,13);
        System.out.println(person);

        Method show = clazz.getMethod("show");
        show.invoke(person);

        System.out.println("==============");
        //NoSuchFieldException filed是不可以调用私有属性 方法  构造方法
        Field name = clazz.getDeclaredField("name");
        //IllegalAccessException  我们没有权限去给私有的内容赋值
        //开启权限
        name.setAccessible(true);
        name.set(person,"jerry");
        System.out.println(person);


        Method method = clazz.getDeclaredMethod("showNation", String.class);
        //开启权限
        method.setAccessible(true);
        method.invoke(person,"中国");

        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
        //开启权限
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance("萌萌");
        Person person1=(Person) o;
        System.out.println(person1);


    }
}
