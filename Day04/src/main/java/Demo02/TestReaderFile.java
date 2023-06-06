package Demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class TestReaderFile {
    public static void main(String[] args) throws Exception {

        //使用流的方式获取外部文件参数
        Properties properties = new Properties();
        /*FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        properties.load(fileInputStream);*/

        //使用类加载器方式获取外部文件，默认是从src路径下获取
        ClassLoader classLoader = TestReaderFile.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(resourceAsStream);


        String name = properties.getProperty("name");
        String pwd = properties.getProperty("pwd");
        System.out.println(name+","+pwd);

    }

}
