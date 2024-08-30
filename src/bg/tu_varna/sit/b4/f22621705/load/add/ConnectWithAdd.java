package bg.tu_varna.sit.b4.f22621705.load.add;

import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class ConnectWithAdd extends ConnectWithLoadCommands {
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;

    public ConnectWithAdd(OpenedFiles openedFiles,StringBuilder stringBuilder) {
        this.openedFiles = openedFiles;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public LoadCommands aAA() {
        return new Add(openedFiles,stringBuilder);
    }
}
