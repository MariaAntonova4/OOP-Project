package bg.tu_varna.sit.b4.f22621705.exit;

import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.MapClass;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;

public class Exit extends MapClass {
    public Exit() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new ExitProgram();
    }
}
