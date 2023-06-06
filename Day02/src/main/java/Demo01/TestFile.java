package Demo01;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
       File f1 = new File("E:\\IDEA\\Project\\Maven\\Day02\\src\\main\\java\\Demo01\\hello");
       File f2 = new File("E:\\IDEA\\Project\\Maven\\good.txt");

        System.out.println(f1.isFile());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.canRead());
        System.out.println(f1.canExecute());
        System.out.println(f1.exists());
        System.out.println(f1.getName());
        System.out.println("=======================================");
        System.out.println(f2.isFile());
        System.out.println(f2.getPath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.canRead());
        System.out.println(f2.canExecute());
        System.out.println(f2.exists());
        System.out.println(f2.getName());

        /*if(f2.exists()){
            f2.delete();
            System.out.println("文件已删除");
        }else{
            try {
                f2.createNewFile();
                System.out.println("文件已新建");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
    }
}
