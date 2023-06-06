package Demo02;

import Demo01.Person;

public class ClassTest {
    public static void main(String[] args) throws Exception {
        //获取类的实例

        //方法一
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        //方式二
        Person person = new Person();
        Class aClass = person.getClass();
        System.out.println(aClass);

        //方式三
        Class aClass1 = Class.forName("Demo01.Person");
        System.out.println(aClass1);

        //方式四
        Class aClass2 = ClassTest.class.getClassLoader().loadClass("Demo01.Person");
        System.out.println(aClass2);
    }


}
