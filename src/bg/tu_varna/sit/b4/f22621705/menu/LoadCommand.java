package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.Scanner;

public class LoadCommand implements Menu {
    private StringBuilder stringBuilder;
    private Session session;
    private OpenedFiles openedFiles;
    public LoadCommand(OpenedFiles openedFiles,Session session,StringBuilder stringBuilder) {
        this.openedFiles = openedFiles;
        this.session=session;
        this.stringBuilder=stringBuilder;
    }
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public Menu execute() throws IOException {
        stringBuilder.delete(0, stringBuilder.indexOf(" ")+1);
            return new Load(session).exe(stringBuilder,openedFiles);

    }
}
