package bg.tu_varna.sit.b4.f22621705.close;

import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.CreateFiles;
import bg.tu_varna.sit.b4.f22621705.menu.MapClass;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.*;
import java.util.Map;

public class CloseFile implements Menu {
    private MapClass mapClass;

    public CloseFile(MapClass mapClass) {
        this.mapClass=mapClass;
    }

    @Override
    public Menu execute() throws IOException, CommandException {
        mapClass.setOpenedFiles(new OpenedFiles());
        mapClass.setSession2(new Session());
        mapClass.updateMenu();
        return null;
    }
}
