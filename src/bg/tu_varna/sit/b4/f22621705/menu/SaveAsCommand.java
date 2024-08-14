package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.saveAs.SaveAsInFile;

import java.io.IOException;
import java.util.Scanner;

public class SaveAsCommand implements Menu{
    @Override
    public Menu execute() throws IOException {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();

        return new SaveAsInFile().saveAsFile(str);
    }
}
