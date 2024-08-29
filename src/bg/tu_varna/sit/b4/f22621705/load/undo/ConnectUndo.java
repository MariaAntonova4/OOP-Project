package bg.tu_varna.sit.b4.f22621705.load.undo;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class ConnectUndo extends ConnectWithLoadCommands {
    private ConnectWithLoadCommands connectWithLoadCommands;

    public ConnectUndo(ConnectWithLoadCommands connectWithLoadCommands) {
        this.connectWithLoadCommands = connectWithLoadCommands;
    }

    @Override
    public LoadCommands aAA() {
        return new Undo(connectWithLoadCommands);
    }
}
