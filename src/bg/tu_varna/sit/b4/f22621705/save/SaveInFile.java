package bg.tu_varna.sit.b4.f22621705.save;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SaveInFile {
    public void saveFile(File file, int[] array) throws IOException {
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(Arrays.toString(array));
    }
}



