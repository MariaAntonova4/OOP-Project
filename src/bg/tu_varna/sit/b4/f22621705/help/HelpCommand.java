package bg.tu_varna.sit.b4.f22621705.help;

import bg.tu_varna.sit.b4.f22621705.CommandException;
import bg.tu_varna.sit.b4.f22621705.MapClass;
import bg.tu_varna.sit.b4.f22621705.Menu;

public class HelpCommand extends MapClass {
    public HelpCommand() throws CommandException {
    }

    @Override
    public Menu aaa() {
        return new Help();
    }
}
