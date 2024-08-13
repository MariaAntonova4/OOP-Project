package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.Scanner;

public class LoadCommand implements Menu {
    private Session session=new Session();

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public Menu execute(OpenedFiles openedFiles,Session session2) throws IOException {
        String fileName;
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();
        return new Load(session).exe(fileName,openedFiles);
    }
}
