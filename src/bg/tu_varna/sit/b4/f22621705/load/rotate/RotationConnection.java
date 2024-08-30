package bg.tu_varna.sit.b4.f22621705.load.rotate;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;

public class RotationConnection extends ConnectWithLoadCommands {
    private StringBuilder stringBuilder;

    public RotationConnection(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public LoadCommands aAA() {
        return new ChooseDirection(stringBuilder);
    }
}
