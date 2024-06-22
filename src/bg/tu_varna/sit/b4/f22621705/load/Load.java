package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.LoadCommand;
import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.load.add.ZZ;
import bg.tu_varna.sit.b4.f22621705.load.grayscale.GG;
import bg.tu_varna.sit.b4.f22621705.load.monochrome.KK;
import bg.tu_varna.sit.b4.f22621705.load.negative.HH;
import bg.tu_varna.sit.b4.f22621705.load.rotate.FF;
import bg.tu_varna.sit.b4.f22621705.load.session_info.PP;
import bg.tu_varna.sit.b4.f22621705.load.switchh.LoadSwitch;
import bg.tu_varna.sit.b4.f22621705.load.undo.XX;

import java.io.IOException;
import java.util.*;


public class Load {
    private Session session;

    public Load(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return session;
    }


    public void setSession(Session session) {
        if (session==null){
            session=new Session();
        }else this.session = session;
    }

    private EE ee;

    public EE getEe() {
        return ee;
    }

    public void setEe(EE ee) {
        this.ee = ee;
    }

    public void loadMapping(){
        getEe().putLoad("negative",new HH().aAA());
        getEe().putLoad("rotate",new FF().aAA());
        getEe().putLoad("grayscale",new GG().aAA());
        getEe().putLoad("monochrome",new KK().aAA());
        getEe().putLoad("undo",new XX().aAA());
        getEe().putLoad("add",new ZZ().aAA());
        getEe().putLoad("session_info",new PP().aAA());
        getEe().putLoad("switch",new LoadSwitch().aAA());
    }

    public Menu exe(String fileName,Session session) throws IOException {
        setEe(new FF());
        loadMapping();
        //session=new Session();
        System.out.println("Session with ID:");
        Scanner scannerNum=new Scanner(System.in);
        int mapNum= Integer.parseInt(scannerNum.next());
        session.createSession(mapNum,fileName);
        Scanner scanner=new Scanner(System.in);
        String commandName;

        System.out.println("Please write the LOAD command you want to be executed: ");
        commandName=scanner.next();

        while(ee.commandExist(commandName)){
        ee.commands(commandName,session);
            System.out.println("Please write the LOAD command you want to be executed: ");
            commandName=scanner.next();
        }
        LoadCommand loadCommand=new LoadCommand();
       // loadCommand.setSession(session);
      return null;
    }
}
