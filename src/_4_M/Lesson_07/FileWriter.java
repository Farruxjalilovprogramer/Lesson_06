package _4_M.Lesson_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWriter {
    public static void main(String[] args) throws Exception {
        File file=new File("D:\\диа.txt");
        OutputStream outputStream=new FileOutputStream(file);
        outputStream.write("ДААА".getBytes());

        outputStream.close();
    }

}
