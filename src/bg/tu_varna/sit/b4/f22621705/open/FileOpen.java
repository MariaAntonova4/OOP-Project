package bg.tu_varna.sit.b4.f22621705.open;

import java.io.*;

public class FileOpen {
    private CheckFile checkFile;
    public void readFile(File file) throws IOException {
        if (checkFile.checkIfFileExists(file)){
        FileReader reader=new FileReader(file);
        reader.read();
        reader.close();}
    }
}
