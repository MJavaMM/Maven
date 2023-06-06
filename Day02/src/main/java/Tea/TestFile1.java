package Tea;
/*
*
public String getAbsolutePath()：获取绝对路径
public String getPath() ：获取路径
public String getName() ：获取名称
public String getParent()：获取上层文件目录路径。若无，返回null
public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
public long lastModified() ：获取最后一次的修改时间，毫秒值
*
*
*
* 如下的两个方法适用于文件目录：
public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组

 public boolean renameTo(File dest):把文件重命名为指定的文件路径
     比如：file1.renameTo(file2)为例：
        要想保证返回true,需要file1在硬盘中是存在的，且file2不能在硬盘中存在。
*
*
*
public boolean isDirectory()：判断是否是文件目录
public boolean isFile() ：判断是否是文件
public boolean exists() ：判断是否存在
public boolean canRead() ：判断是否可读
public boolean canWrite() ：判断是否可写
public boolean isHidden() ：判断是否隐藏
* */


import java.io.File;
import java.io.IOException;

/*
* IO流
*      就是针对文件内容的输入和输出的操作。输入和输出都是相对于计算机而言的。
*      操作文件的内容首先需要先找到文件，
*       相对路径：就是相对当前文件所在的路径
*        觉得路径：就是带有盘符的路径。
*
*
* */
public class TestFile1 {

    public static void main(String[] args) {
        File f1 = new File("h.txt");//相对路径
        File f2 = new File("D:\\workspace\\java15\\HelloWorld.txt"); //绝对路径


        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.length());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
        System.out.println(f1.getName());
        System.out.println(f1.canExecute());

        System.out.println("========================");

        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getPath());
        System.out.println(f2.length());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.canWrite());
        System.out.println(f2.canRead());
        System.out.println(f2.getName());
        System.out.println(f2.canExecute());


        System.out.println("--------------------");

        if(f1.exists()){
            f1.delete();
            System.out.println("删除文件成功...");
        }else{
            try {
                f1.createNewFile();
                System.out.println("文件创建成功....");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }





}
