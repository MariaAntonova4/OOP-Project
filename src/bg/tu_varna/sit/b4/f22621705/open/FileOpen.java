package bg.tu_varna.sit.b4.f22621705.open;
import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public interface FileOpen {
    Menu readFile(String fileName) throws IOException;
    int findWidthAndHeight(FileInputStream reader) throws IOException;
    public StringBuilder cleanFormat();
}
