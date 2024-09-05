package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.models.open.Open;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

public class OpenLauncher extends MenuLauncher {
    private OpenedFiles openedFiles;
    private StringBuilder stringBuilder;
    public OpenLauncher(OpenedFiles openedFiles, StringBuilder stringBuilder) throws CommandException {
        if (openedFiles==null){
            this.openedFiles=new OpenedFiles();
        }else this.openedFiles=openedFiles;
        this.stringBuilder=stringBuilder;
    }

    @Override
    public Menu executeCommand() {
        return new Open(openedFiles,stringBuilder);
    }
}
