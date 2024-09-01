package bg.tu_varna.sit.b4.f22621705.menu;


import bg.tu_varna.sit.b4.f22621705.close.Close;
import bg.tu_varna.sit.b4.f22621705.exit.Exit;
import bg.tu_varna.sit.b4.f22621705.help.HelpCommand;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class CreateFiles {
    private MapClass e;
    private Commands commands;

    public CreateFiles() {
        this.commands = Commands.HELP;
    }

    public MapClass getE() {
        return e;
    }

    public void setE(MapClass e) {
        this.e = e;
    }

    /**
     *
     * @throws CommandException if there is no such command
     */
    public void putInMap(OpenedFiles openedFiles,Session session,StringBuilder stringBuilder) throws CommandException {
        e.puttingInMap(Commands.OPEN.getCommand(),new ConnectWithOpen(openedFiles,stringBuilder).aaa());
        e.puttingInMap(Commands.LOAD.getCommand(), new ConnectWithLoad(openedFiles,session,stringBuilder).aaa());
        e.puttingInMap(Commands.SAVE.getCommand(), new ConnectWithSave(session).aaa());
        e.puttingInMap(Commands.HELP.getCommand(), new HelpCommand().aaa());
        e.puttingInMap(Commands.EXIT.getCommand(), new Exit().aaa());
        e.puttingInMap(Commands.SAVE_AS.getCommand(), new SaveAs(session,stringBuilder).aaa());
        e.puttingInMap(Commands.CLOSE.getCommand(), new Close(getE()).aaa());
    }
}
