package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.menu.models.exit.ExitProgram;

public class ExitLauncher extends MenuLauncher {
    public ExitLauncher() throws CommandException {
    }

    @Override
    public Menu executeCommand() {
        return new ExitProgram();
    }
}
