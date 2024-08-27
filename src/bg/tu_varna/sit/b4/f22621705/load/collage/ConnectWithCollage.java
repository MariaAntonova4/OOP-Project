package bg.tu_varna.sit.b4.f22621705.load.collage;

import bg.tu_varna.sit.b4.f22621705.files.Row;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class ConnectWithCollage extends ConnectWithLoadCommands {
    private OpenedFiles openedFiles;

    public ConnectWithCollage(OpenedFiles openedFiles) {
        this.openedFiles = openedFiles;
    }

    @Override
    public LoadCommands aAA() {
        return new Collage(openedFiles);
    }
}
