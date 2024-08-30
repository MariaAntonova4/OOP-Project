package bg.tu_varna.sit.b4.f22621705.load.switchh;

import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class LoadSwitch extends ConnectWithLoadCommands {
    private Load load;

    public LoadSwitch(Load load) {
        this.load = load;
    }

    @Override
    public LoadCommands aAA() {
        return new Switchh(load);
    }
}
