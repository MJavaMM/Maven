package tea;

public class TestClassLoad {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader classLoader = TestClassLoad.class.getClassLoader();
        System.out.println(classLoader);
        //系统的扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
        //引导类加载器，存在但是不能直接获取
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

    }
}
