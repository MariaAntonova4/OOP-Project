package bg.tu_varna.sit.b4.f22621705.oldClasses;

import bg.tu_varna.sit.b4.f22621705.menu.Menu;

import java.io.IOException;

public interface SaveFile {
    Menu saveFile(String fileName,StringBuilder stringBuilder) throws IOException;
    static String filePath="C:\\Users\\Asus\\Desktop\\OOP-PROJECT\\OOP-Project\\Files\\";
}
