package bg.tu_varna.sit.b4.f22621705.load.undo;

import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class ConnectUndo extends ConnectWithLoadCommands {
    private Load load;

    public ConnectUndo(Load load) {
        this.load = load;
    }

    @Override
    public LoadCommands aAA() {
        return new Undo(load);
    }
}
