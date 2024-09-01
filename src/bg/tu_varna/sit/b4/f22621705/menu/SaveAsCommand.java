package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.saveAs.SaveAsInFile;

import java.io.IOException;
import java.util.Scanner;

public class SaveAsCommand implements Menu{
    private Session session;
    private StringBuilder stringBuilder;
    public SaveAsCommand(Session session,StringBuilder stringBuilder) {
        this.session = session;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu execute() throws IOException {
        String str=stringBuilder.substring(8, stringBuilder.length());
        //Scanner scanner=new Scanner(System.in);
        //str=scanner.nextLine();
        return new SaveAsInFile(str).saveAsFile(session);
    }
}
