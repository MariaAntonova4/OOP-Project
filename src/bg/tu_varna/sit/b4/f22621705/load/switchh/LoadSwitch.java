package bg.tu_varna.sit.b4.f22621705.load.switchh;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class LoadSwitch extends ConnectWithLoadCommands {
    @Override
    public LoadCommands aAA() {
        return new Switchh();
    }
}
