package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.models.saveAs.SaveAsCommand;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;

public class SaveAsLauncher extends MenuLauncher {
    private StringBuilder stringBuilder;
    private Session session;
    public SaveAsLauncher(Session session, StringBuilder stringBuilder) throws CommandException {
        this.session=session;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu executeCommand() {
        return new SaveAsCommand(session,stringBuilder);
    }
}
