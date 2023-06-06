package Demo01;

import tea.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPerson {
    public static void main(String[] args) throws Exception {

        //通过构造方法赋值
        Class<Person> clzz = Person.class;
        Constructor<Person> constructor = clzz.getConstructor(int.class ,String.class);
        Person person =constructor.newInstance(25,"tom");
        System.out.println(person);

        //通过制定的属性和方法赋值
        Field age = clzz.getField("age");
        age.set(person,29);
        System.out.println(person);

        Method show = clzz.getMethod("show");
        show.invoke(person);

        Field name = clzz.getDeclaredField("name");
        name.setAccessible(true);   //开启权限
        name.set(person,"jerry");
        System.out.println(person);

        /*Method nation = clzz.getDeclaredMethod("", String.class);
        nation.setAccessible(true);
        nation.invoke(person,"中国");*/

        Constructor declaredConstructor = clzz.getDeclaredConstructor(String.class);
        //开启权限
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance("zhangsan");
        Person person1=(Person) o;
        System.out.println(person1);

    }
}
