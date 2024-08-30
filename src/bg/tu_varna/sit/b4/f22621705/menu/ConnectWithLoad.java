package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class ConnectWithLoad extends MapClass {
    private OpenedFiles openedFiles;
    private Session session;
    private StringBuilder stringBuilder;
    public ConnectWithLoad(OpenedFiles openedFiles,Session session,StringBuilder stringBuilder) throws CommandException {
        this.openedFiles=openedFiles;
        this.session=session;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu aaa() {
        return new LoadCommand(openedFiles,session,stringBuilder);
    }
}
