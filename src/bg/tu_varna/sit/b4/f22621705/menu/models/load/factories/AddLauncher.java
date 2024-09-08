package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.add.Add;

public class AddLauncher extends LoadMenuLauncher {
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;

    public AddLauncher(OpenedFiles openedFiles, StringBuilder stringBuilder) {
        this.openedFiles = openedFiles;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public LoadMenu executeLoadCommand() {
        return new Add(openedFiles,stringBuilder);
    }
}
