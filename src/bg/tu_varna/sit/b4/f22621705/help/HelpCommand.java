package bg.tu_varna.sit.b4.f22621705.help;

import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.MapClass;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;

public class HelpCommand extends MapClass {
    public HelpCommand() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new Help();
    }
}
