package _4_M.Lesson_07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.SortedMap;

public class FileReader {
    public static void main(String[] args) throws Exception {
        File file=new File("D:\\диа.txt");
        InputStream inputStream=new FileInputStream(file);
        byte[] temp = new byte[inputStream.available()];
        inputStream.read(temp);
        System.out.println( );
        inputStream.close();
    }
}
