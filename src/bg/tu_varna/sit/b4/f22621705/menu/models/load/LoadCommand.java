package bg.tu_varna.sit.b4.f22621705.menu.models.load;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.Load;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;

import java.io.IOException;

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

    /**
     *
     * @return method from the Load class
     * @throws IOException
     * deletes the "load" from the stringBuilder and a method from a new class is called
     */
    @Override
    public Menu execute() throws IOException, PixelException, SwitchException, DirectionException {
        stringBuilder.delete(0, stringBuilder.indexOf(" ")+1);
            return new Load(session).exe(stringBuilder,openedFiles);

    }
}
