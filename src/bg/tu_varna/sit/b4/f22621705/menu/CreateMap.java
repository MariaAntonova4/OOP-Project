package bg.tu_varna.sit.b4.f22621705.menu;


import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.factories.*;
import bg.tu_varna.sit.b4.f22621705.menu.models.close.Close;
import bg.tu_varna.sit.b4.f22621705.menu.models.exit.ExitProgram;
import bg.tu_varna.sit.b4.f22621705.menu.models.help.Help;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.LoadCommand;
import bg.tu_varna.sit.b4.f22621705.menu.models.open.Open;
import bg.tu_varna.sit.b4.f22621705.menu.models.save.Save;
import bg.tu_varna.sit.b4.f22621705.menu.models.saveAs.SaveAsCommand;

public class CreateMap {
    private MenuLauncher menuLauncher;
    private Commands commands;

    public CreateMap() {
        this.commands = Commands.HELP;
    }

    public MenuLauncher getMenuLauncher() {
        return menuLauncher;
    }

    public void setMenuLauncher(MenuLauncher menuLauncher) {
        this.menuLauncher = menuLauncher;
    }

    /**
     *
     * @throws CommandException if there is no such command
     * the commands in the new menu are loaded
     */
    public void putInMap(OpenedFiles openedFiles, Session session, StringBuilder stringBuilder) throws CommandException {
        menuLauncher.puttingInMap(Commands.OPEN.getCommand(),new Open(openedFiles,stringBuilder));
        menuLauncher.puttingInMap(Commands.LOAD.getCommand(), new LoadCommand(openedFiles,session,stringBuilder));
        menuLauncher.puttingInMap(Commands.SAVE.getCommand(), new Save(session));
        menuLauncher.puttingInMap(Commands.HELP.getCommand(), new Help());
        menuLauncher.puttingInMap(Commands.EXIT.getCommand(), new ExitProgram());
        menuLauncher.puttingInMap(Commands.SAVE_AS.getCommand(), new SaveAsCommand(session,stringBuilder));
        menuLauncher.puttingInMap(Commands.CLOSE.getCommand(), new Close(getMenuLauncher()));
    }
}
