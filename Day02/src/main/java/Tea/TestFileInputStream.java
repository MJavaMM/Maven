package Tea;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFileInputStream {

    public static void main(String[] args) throws Exception {
        File file = new File("h.txt");

        FileInputStream fis = new FileInputStream(file);
        byte [] buffer = new byte[30];
        int len;
        while((len=fis.read(buffer))!=-1){
            String str = new String(buffer,0,len);
            System.out.println(str);
        }
        fis.close();
    }
}
