package bg.tu_varna.sit.b4.f22621705.menu.models.saveAs;

import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.files.Session;

import java.io.IOException;

public class SaveAsCommand implements Menu {
    private Session session;
    private StringBuilder stringBuilder;
    public SaveAsCommand(Session session,StringBuilder stringBuilder) {
        this.session = session;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu execute() throws IOException {
        String nameOfFile=stringBuilder.substring(8, stringBuilder.length());
        return new SaveAsInFile(nameOfFile).saveAsFile(session);
    }
}
