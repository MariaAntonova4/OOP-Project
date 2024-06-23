package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.saveAs.SaveAsInFile;

import java.io.IOException;
import java.util.Scanner;

public class SaveAsCommand implements Menu{
    @Override
    public Menu execute(Session session) throws IOException {
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();

        return new SaveAsInFile(session).saveAsFile(session,str);
    }
}
