package Tea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStringTest {
    public static void main(String[] args) throws Exception {
        File file = new File("h3.txt");
        FileOutputStream fos=new FileOutputStream(file);
        fos.write("you love java".getBytes());
        fos.close();
    }
}
