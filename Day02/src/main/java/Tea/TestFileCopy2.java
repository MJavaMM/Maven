package Tea;

import java.io.*;

public class TestFileCopy2 {
    public static void main(String[] args) {
        try {
            //获取系统当前时间
            long start = System.currentTimeMillis();
          // 24729
           // TestFileCopy2.copy1("C:\\Users\\HelloWorld\\Desktop\\0601\\03_Collection的常用方法2.mp4","C:\\Users\\HelloWorld\\Desktop\\0601\\方法2.mp4");
           //  775
            TestFileCopy2.copy2("C:\\Users\\HelloWorld\\Desktop\\0601\\03_Collection的常用方法2.mp4","C:\\Users\\HelloWorld\\Desktop\\0601\\方法3.mp4");



            long end = System.currentTimeMillis();
            System.out.println("消耗时间为："+(end-start));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*  处理流视频复制的方法*/
    public static void copy1(String src,String path) throws  Exception{
        File f1 = new File(src);
        File f2 = new File(path);

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos=new FileOutputStream(f2);

        byte [] buffer = new byte[30];
        int len;
        while((len=fis.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fis.close();
        fos.close();

    }


    public static void copy2(String src,String path) throws  Exception{
        File f1 = new File(src);
        File f2 = new File(path);

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos=new FileOutputStream(f2);

        BufferedInputStream bis =new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte [] buffer = new byte[30];
        int len;
        while((len=bis.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }
      /*  fis.close();
        fos.close();
        bis.close();*/
        bos.close();

    }
}
