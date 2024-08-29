package bg.tu_varna.sit.b4.f22621705.load.switchh;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class LoadSwitch extends ConnectWithLoadCommands {
    private int sessionNumber;

    public LoadSwitch(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public LoadCommands aAA() {
        return new Switchh(sessionNumber);
    }
}
