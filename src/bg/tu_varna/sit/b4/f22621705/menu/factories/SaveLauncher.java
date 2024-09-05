package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.models.save.Save;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;

public class SaveLauncher extends MenuLauncher {
    private Session session;
    public SaveLauncher(Session session) throws CommandException {
        this.session=session;
    }

    @Override
    public Menu executeCommand() {
        return new Save(session);
    }
}
