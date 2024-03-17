package bg.tu_varna.sit.b4.f22621705.save;
import java.io.*;
public class SaveInFile {
    public void saveFile(File file,String string) throws IOException {
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(string);
    }
}



