package bg.tu_varna.sit.b4.f22621705.menu.models.save;

import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

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
