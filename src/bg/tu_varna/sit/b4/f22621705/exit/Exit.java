package bg.tu_varna.sit.b4.f22621705.exit;

import bg.tu_varna.sit.b4.f22621705.CommandException;
import bg.tu_varna.sit.b4.f22621705.MapClass;
import bg.tu_varna.sit.b4.f22621705.Menu;

public class Exit extends MapClass {
    public Exit() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new ExitProgram();
    }
}
