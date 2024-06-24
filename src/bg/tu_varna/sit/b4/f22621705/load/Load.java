package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.LoadCommand;
import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.load.add.ConnectWithAdd;
import bg.tu_varna.sit.b4.f22621705.load.grayscale.ConnectWithGrayscale;
import bg.tu_varna.sit.b4.f22621705.load.monochrome.ConnectWithMonochrome;
import bg.tu_varna.sit.b4.f22621705.load.negative.ConnectWithNegative;
import bg.tu_varna.sit.b4.f22621705.load.rotate.RotationConnection;
import bg.tu_varna.sit.b4.f22621705.load.session_info.SessionConnection;
import bg.tu_varna.sit.b4.f22621705.load.switchh.LoadSwitch;
import bg.tu_varna.sit.b4.f22621705.load.undo.ConnectUndo;

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

    private ConnectWithLoadCommands ee;

    public ConnectWithLoadCommands getEe() {
        return ee;
    }

    public void setEe(ConnectWithLoadCommands ee) {
        this.ee = ee;
    }

    public void loadMapping(){
        getEe().putLoad("negative",new ConnectWithNegative().aAA());
        getEe().putLoad("rotate",new RotationConnection().aAA());
        getEe().putLoad("grayscale",new ConnectWithGrayscale().aAA());
        getEe().putLoad("monochrome",new ConnectWithMonochrome().aAA());
        getEe().putLoad("undo",new ConnectUndo().aAA());
        getEe().putLoad("add",new ConnectWithAdd().aAA());
        getEe().putLoad("session_info",new SessionConnection().aAA());
        getEe().putLoad("switch",new LoadSwitch().aAA());
    }

    public Menu exe(String fileName,Session session) throws IOException {
        setEe(new RotationConnection());
        loadMapping();
        //session=new Session();
        System.out.println("Session with ID:");
        Scanner scannerNum=new Scanner(System.in);
        int mapNum= Integer.parseInt(scannerNum.next());
        session.createSession(mapNum,fileName);
        System.out.println("Image "+fileName+" added");
        Scanner scanner=new Scanner(System.in);
        String commandName;


        commandName=scanner.next();

        while(ee.commandExist(commandName)){
        ee.commands(commandName,session);
           // System.out.println("Please write the LOAD command you want to be executed: ");
            commandName=scanner.next();
        }
        LoadCommand loadCommand=new LoadCommand();
       // loadCommand.setSession(session);
      return null;
    }
}
