package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.LoadCommand;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

public class LoadLauncher extends MenuLauncher {
    private OpenedFiles openedFiles;
    private Session session;
    private StringBuilder stringBuilder;
    public LoadLauncher(OpenedFiles openedFiles, Session session, StringBuilder stringBuilder) throws CommandException {
        this.openedFiles=openedFiles;
        this.session=session;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu executeCommand() {
        return new LoadCommand(openedFiles,session,stringBuilder);
    }
}
