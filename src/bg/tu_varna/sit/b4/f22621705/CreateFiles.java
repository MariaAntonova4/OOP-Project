package bg.tu_varna.sit.b4.f22621705;

//import bg.tu_varna.sit.b4.f22621705.additionalClasses.Map1;

import bg.tu_varna.sit.b4.f22621705.exit.Exit;
import bg.tu_varna.sit.b4.f22621705.help.HelpCommand;

public class CreateFiles {
    private MapClass e;
    public MapClass getE() {
        return e;
    }

    public void setE(MapClass e) {
        this.e = e;
    }

    public void putInMap(){
        e.puttingInMap("open",new ConnectWithOpen().aaa());
        e.puttingInMap("load",new ConnectWithLoad().aaa());
        e.puttingInMap("save",new ConnectWithSave().aaa());
        e.puttingInMap("help",new HelpCommand().aaa());
        e.puttingInMap("exit",new Exit().aaa());
        e.puttingInMap("saveas",new SaveAs().aaa());
    }
}
