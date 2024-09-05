package bg.tu_varna.sit.b4.f22621705.menu;


import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.menu.factories.CloseLauncher;
import bg.tu_varna.sit.b4.f22621705.menu.factories.ExitLauncher;
import bg.tu_varna.sit.b4.f22621705.menu.factories.HelpLauncher;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.factories.*;

public class CreateFiles {
    private MenuLauncher menuLauncher;
    private Commands commands;

    public CreateFiles() {
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
     */
    public void putInMap(OpenedFiles openedFiles, Session session, StringBuilder stringBuilder) throws CommandException {
        menuLauncher.puttingInMap(Commands.OPEN.getCommand(),new OpenLauncher(openedFiles,stringBuilder).executeCommand());
        menuLauncher.puttingInMap(Commands.LOAD.getCommand(), new LoadLauncher(openedFiles,session,stringBuilder).executeCommand());
        menuLauncher.puttingInMap(Commands.SAVE.getCommand(), new SaveLauncher(session).executeCommand());
        menuLauncher.puttingInMap(Commands.HELP.getCommand(), new HelpLauncher().executeCommand());
        menuLauncher.puttingInMap(Commands.EXIT.getCommand(), new ExitLauncher().executeCommand());
        menuLauncher.puttingInMap(Commands.SAVE_AS.getCommand(), new SaveAsLauncher(session,stringBuilder).executeCommand());
        menuLauncher.puttingInMap(Commands.CLOSE.getCommand(), new CloseLauncher(getMenuLauncher()).executeCommand());
    }
}
