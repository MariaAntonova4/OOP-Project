package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.menu.models.close.Close;

public class CloseLauncher extends MenuLauncher {
    private MenuLauncher menuLauncher;
    public CloseLauncher(MenuLauncher menuLauncher) throws CommandException {
        this.menuLauncher=menuLauncher;
    }

    @Override
    public Menu executeCommand() {
        return new Close(menuLauncher);
    }
}
