package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.load.collage.ConnectWithCollage;
import bg.tu_varna.sit.b4.f22621705.menu.Menu;
import bg.tu_varna.sit.b4.f22621705.load.add.ConnectWithAdd;
import bg.tu_varna.sit.b4.f22621705.load.grayscale.ConnectWithGrayscale;
import bg.tu_varna.sit.b4.f22621705.load.monochrome.ConnectWithMonochrome;
import bg.tu_varna.sit.b4.f22621705.load.negative.ConnectWithNegative;
import bg.tu_varna.sit.b4.f22621705.load.rotate.RotationConnection;
import bg.tu_varna.sit.b4.f22621705.load.session_info.SessionConnection;
import bg.tu_varna.sit.b4.f22621705.load.switchh.LoadSwitch;
import bg.tu_varna.sit.b4.f22621705.load.undo.ConnectUndo;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

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

    private ConnectWithLoadCommands ee;

    public ConnectWithLoadCommands getEe() {
        return ee;
    }

    public void setEe(ConnectWithLoadCommands ee) {
        this.ee = ee;
    }

    /**
     * adds the commands of the load command
     */
    public void loadMapping(OpenedFiles openedFiles1){
        getEe().putLoad("negative",new ConnectWithNegative().aAA());
        getEe().putLoad("rotate",new RotationConnection().aAA());
        getEe().putLoad("grayscale",new ConnectWithGrayscale().aAA());
        getEe().putLoad("monochrome",new ConnectWithMonochrome().aAA());
        getEe().putLoad("undo",new ConnectUndo().aAA());
        getEe().putLoad("add",new ConnectWithAdd(openedFiles1).aAA());
        getEe().putLoad("session_info",new SessionConnection().aAA());
        getEe().putLoad("switch",new LoadSwitch().aAA());
        getEe().putLoad("collage",new ConnectWithCollage(openedFiles1).aAA());
    }

    /**
     *
     * @param fileName the name of the file
     * @param session the session in witch the file is put
     * @return
     * @throws IOException
     */
    public Menu exe(String fileName, OpenedFiles openedFiles) throws IOException {
        setEe(new RotationConnection());
        loadMapping(openedFiles);
        System.out.println("Session with ID:");
        Scanner scannerNum=new Scanner(System.in);
        int mapNum= Integer.parseInt(scannerNum.next());
        session.createSession(mapNum,openedFiles.NamesOfOpenedFiles(fileName));
        System.out.println("Image "+fileName+" added");
        Scanner scanner=new Scanner(System.in);
        String commandName;


        commandName=scanner.next();

        while(ee.commandExist(commandName)){
        ee.commands(commandName,session,mapNum);

            commandName=scanner.next();
        }

      return null;
    }
}
