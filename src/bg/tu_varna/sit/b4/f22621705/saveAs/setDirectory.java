package bg.tu_varna.sit.b4.f22621705.saveAs;

import java.io.*;

public class setDirectory {
    public void directory(String filePath,String data) throws IOException {
        File file=new File(filePath);
        FileWriter fileWriter=new FileWriter(file.getName());
        fileWriter.write(data);
    }
}
