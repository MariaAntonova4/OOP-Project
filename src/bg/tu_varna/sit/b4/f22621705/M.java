package bg.tu_varna.sit.b4.f22621705;

//import bg.tu_varna.sit.b4.f22621705.additionalClasses.Map1;

import bg.tu_varna.sit.b4.f22621705.exit.Exit;
import bg.tu_varna.sit.b4.f22621705.help.HelpCommand;

public class M {
    private MapClass e;
    public MapClass getE() {
        return e;
    }

    public void setE(MapClass e) {
        this.e = e;
    }

    //private Map<String,A> mapABC=new HashMap<>();
    public void putInMap(){
       // mapABC.put(string,aaa());
        e.puttingInMap("open",new H().aaa());
        e.puttingInMap("load",new F().aaa());
        e.puttingInMap("save",new G().aaa());
        e.puttingInMap("help",new HelpCommand().aaa());
        e.puttingInMap("exit",new Exit().aaa());
    }
}
