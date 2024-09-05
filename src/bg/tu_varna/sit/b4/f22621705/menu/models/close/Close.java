package bg.tu_varna.sit.b4.f22621705.menu.models.close;

import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.factories.MenuLauncher;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.*;

public class Close implements Menu {
    private MenuLauncher menuLauncher;

    public Close(MenuLauncher menuLauncher) {
        this.menuLauncher=menuLauncher;
    }

    @Override
    public Menu execute() throws IOException, CommandException {
        menuLauncher.setOpenedFiles(new OpenedFiles());
        menuLauncher.setSession(new Session());
        menuLauncher.updateMenu();
        return null;
    }
}
