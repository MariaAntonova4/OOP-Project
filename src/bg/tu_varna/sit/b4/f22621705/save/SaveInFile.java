package bg.tu_varna.sit.b4.f22621705.save;
import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.*;
import java.util.Arrays;

public class SaveInFile extends Menu {
    public void saveFile(File file, int[] array) throws IOException {
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(Arrays.toString(array));
    }
}



