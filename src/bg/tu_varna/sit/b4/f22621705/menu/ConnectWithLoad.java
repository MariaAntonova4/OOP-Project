package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class ConnectWithLoad extends MapClass {
    private OpenedFiles openedFiles;
    private Session session;
    public ConnectWithLoad(OpenedFiles openedFiles,Session session) throws CommandException {
        this.openedFiles=openedFiles;
        this.session=session;
    }

    @Override
    public Menu aaa() {
        return new LoadCommand(openedFiles,session);
    }
}
