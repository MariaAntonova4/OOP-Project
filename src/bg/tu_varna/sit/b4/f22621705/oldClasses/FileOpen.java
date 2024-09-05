package bg.tu_varna.sit.b4.f22621705.oldClasses;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;

import java.io.FileInputStream;
import java.io.IOException;

public interface FileOpen {
    int getHeight();
    int getWidth();
    Menu readFile(String fileName) throws IOException;
    int findWidthAndHeight(FileInputStream reader) throws IOException;
    StringBuilder cleanFormat();
}
