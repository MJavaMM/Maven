package tea;

import java.io.InputStream;
import java.util.Properties;

public class TestReaderFile {
    public static void main(String[] args) throws Exception {
        Properties  pro = new Properties();
        //使用流的方式获取外部文件参数
       /* FileInputStream fis =new FileInputStream("h.properties");
        pro.load(fis);*/
        //使用类加载器方式获取外部文件，默认是从src路径下获取
        ClassLoader classLoader = TestReaderFile.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("w.properties");
        pro.load(resourceAsStream);

        String name = pro.getProperty("name");
        String pwd = pro.getProperty("pwd");
        System.out.println(name+","+pwd);
    }
}
