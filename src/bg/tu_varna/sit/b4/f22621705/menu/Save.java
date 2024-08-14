package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;


public class Save implements Menu {
    private Session session;

    public Save(Session session) {
        this.session = session;
    }

    @Override
    public Menu execute() throws IOException {

        return new SaveInFile().saveFile(session);
    }
}
