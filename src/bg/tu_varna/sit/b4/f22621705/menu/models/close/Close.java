package bg.tu_varna.sit.b4.f22621705.menu.models.close;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.factories.MenuLauncher;
import bg.tu_varna.sit.b4.f22621705.menu.models.MainCommandExecute;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;

import java.io.*;

public class Close implements MainCommandExecute {
    private MenuLauncher menuLauncher;

    public Close(MenuLauncher menuLauncher) {
        this.menuLauncher=menuLauncher;
    }

    /**
     *
     * @return
     * @throws IOException
     * @throws CommandException catches if the command is not written correctly
     * sets new classes for the opened files, the session and updates the menu
     */
    @Override
    public MainCommandExecute execute() throws IOException, CommandException, PixelException, SwitchException, DirectionException {
        menuLauncher.setOpenedFiles(new OpenedFiles());
        menuLauncher.setSession(new Session());
        menuLauncher.updateMenu();
        return null;
    }
}
