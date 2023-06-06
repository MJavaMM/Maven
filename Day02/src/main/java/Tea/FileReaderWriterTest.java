package Tea;

/*
*   流的分类：
*           按照流向分：输入流  输出流
*           按照单位分：字节流   字符类
*           按照角色分：节点流   处理流
*   流的基本体系
*       基类                      处理流                         缓冲流【就是提高效率】
*       InputStream             FileInputStream                 BufferFileInputStream
*       OutputStream            FileOutputStream                BufferFileOutputStream
*       Reader                  FileReader                      BufferFileReader
*       Writer                  FileWriter                      BufferFileWriter
*
*
* 类似  .txt  .doc  .xml  这种都可以使用字符流操作
* 类似    .avi    .mp3  .jpg  .mp4  .png  字节流
*
* */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterTest {
    public static void main(String[] args) {
        //1.创建文件类
        File file = new File("h.txt");
        FileReader fileReader=null;
        try {
            //2.创建适当的流
             fileReader =new FileReader(file);
        //3.进行读取操作
            //一个一个的读取内容，效率不高
           /* int read = fileReader.read();
            while(read!=-1){//当等于-1的时候表示结束
                System.out.print((char) read);
                read = fileReader.read();
            }*/

            //读取内容方式二
            char [] chars = new char[30];
           // int read = fileReader.read(chars);
            int len;
            while ((len=fileReader.read(chars))!=-1){
                String str = new String(chars,0,len);
                System.out.println(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //4.关闭流
    }
}
