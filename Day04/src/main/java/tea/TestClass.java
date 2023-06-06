package tea;

public class TestClass {
    public static void main(String[] args) throws Exception {
        //获取类的实例的方式
        //方式一：
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        //方式二：
        Person p=new Person();
        Class clazz = p.getClass();
        System.out.println(clazz);
        //方式三
        Class aClass = Class.forName("com.njzhenghou.reflection.Person");
        System.out.println(aClass);
        //方式四：
        Class aClass1 = TestClass.class.getClassLoader().loadClass("com.njzhenghou.reflection.Person");
        System.out.println(aClass1);
    }

}
