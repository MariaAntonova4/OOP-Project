package bg.tu_varna.sit.b4.f22621705.load.collage;

import bg.tu_varna.sit.b4.f22621705.files.Row;
import bg.tu_varna.sit.b4.f22621705.load.ConnectWithLoadCommands;
import bg.tu_varna.sit.b4.f22621705.load.LoadCommands;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class ConnectWithCollage extends ConnectWithLoadCommands {
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;
    public ConnectWithCollage(OpenedFiles openedFiles,StringBuilder stringBuilder) {
        this.openedFiles = openedFiles;
        this.stringBuilder=stringBuilder;
    }
    @Override
    public LoadCommands aAA() {
        stringBuilder.delete(0, stringBuilder.indexOf(" ")+1);
        return new Collage(openedFiles,stringBuilder);
    }
}
