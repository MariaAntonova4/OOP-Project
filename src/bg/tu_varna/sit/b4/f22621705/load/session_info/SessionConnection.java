package bg.tu_varna.sit.b4.f22621705.load.session_info;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class SessionConnection extends ConnectWithLoadCommands {
    @Override
    public LoadCommands aAA() {
        return new ShowSessionInfo();
    }
}
