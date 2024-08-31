package bg.tu_varna.sit.b4.f22621705.close;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.CreateFiles;
import bg.tu_varna.sit.b4.f22621705.menu.MapClass;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.util.HashSet;
import java.util.Set;

public class Close extends MapClass {
    private MapClass mapClass;
    public Close(MapClass mapClass) throws CommandException {
        this.mapClass=mapClass;
    }

    @Override
    public Menu aaa() {
        return new CloseFile(mapClass);
    }
}
