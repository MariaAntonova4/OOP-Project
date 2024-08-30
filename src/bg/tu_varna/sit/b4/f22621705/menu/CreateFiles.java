package bg.tu_varna.sit.b4.f22621705.menu;


import bg.tu_varna.sit.b4.f22621705.exit.Exit;
import bg.tu_varna.sit.b4.f22621705.help.HelpCommand;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

public class CreateFiles {
    private MapClass e;

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
        e.puttingInMap("open",new ConnectWithOpen(openedFiles).aaa());
        e.puttingInMap("load",new ConnectWithLoad(openedFiles,session,stringBuilder).aaa());
        e.puttingInMap("save",new ConnectWithSave(session).aaa());
        e.puttingInMap("help",new HelpCommand().aaa());
        e.puttingInMap("exit",new Exit().aaa());
        e.puttingInMap("save as",new SaveAs(session).aaa());
    }
}
