package bg.tu_varna.sit.b4.f22621705.menu.models.load;

import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.ConnectWithCollage;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.ConnectWithAdd;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.LoadMenuLauncher;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.ConnectWithGrayscale;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.ConnectWithMonochrome;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.ConnectWithNegative;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.RotationConnection;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.SessionConnection;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.LoadSwitch;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.ConnectUndo;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;
import java.util.*;


public class Load {
    StringBuilder commandName;
    private int mapNum;
    private Session session;
    private LoadCommands loadCommand;
    public StringBuilder getCommandName() {
        return commandName;
    }

    public void setCommandName(StringBuilder commandName) {
        if (commandName==null){
            this.commandName=new StringBuilder();
        }
       else this.commandName = commandName;
    }

    public Load(Session session) {
        this.session = session;
        this.loadCommand= LoadCommands.SESSION_INFO;
    }

    public int getMapNum() {
        return mapNum;
    }

    public void setMapNum(int mapNum) {
        if (mapNum==0){
            System.out.println("Session with ID:");
            Scanner scannerNum=new Scanner(System.in);
            this.mapNum= Integer.parseInt(scannerNum.next());
        }
        else this.mapNum = mapNum;
    }

    public Session getSession() {
        return session;
    }

    private LoadMenuLauncher ee;

    public LoadMenuLauncher getEe() {
        return ee;
    }

    public void setEe(LoadMenuLauncher ee) {
        if (ee==null){
            this.ee=new ConnectWithNegative();
        }
        else this.ee = ee;
    }

    /**
     * adds the commands of the load command
     */
    public void loadMapping(OpenedFiles openedFiles1,int numberMap){
        getEe().putLoad(LoadCommands.NEGATIVE.getLoadCommand(), new ConnectWithNegative().aAA());
        getEe().putLoad(LoadCommands.ROTATE.getLoadCommand(), new RotationConnection(getCommandName()).aAA());
        getEe().putLoad(LoadCommands.GRAYSCALE.getLoadCommand(), new ConnectWithGrayscale().aAA());
        getEe().putLoad(LoadCommands.MONOCHROME.getLoadCommand(), new ConnectWithMonochrome().aAA());
        getEe().putLoad(LoadCommands.UNDO.getLoadCommand(), new ConnectUndo(this).aAA());
        getEe().putLoad(LoadCommands.ADD.getLoadCommand(), new ConnectWithAdd(openedFiles1,getCommandName()).aAA());
        getEe().putLoad(LoadCommands.SESSION_INFO.getLoadCommand(), new SessionConnection().aAA());
        getEe().putLoad(LoadCommands.SWITCH.getLoadCommand(), new LoadSwitch(this).aAA());
        getEe().putLoad(LoadCommands.COLLAGE.getLoadCommand(), new ConnectWithCollage(openedFiles1,getCommandName()).aAA());
    }
    public String takeCommand(StringBuilder stringBuilder){
        if (stringBuilder.toString().contains("session info")){
            return "session info";
        } else if (stringBuilder.toString().contains(" ")) {
            return stringBuilder.substring(0, stringBuilder.indexOf(" "));
        }
        else return stringBuilder.toString();
    }
    /**
     *
     * @param fileName the name of the file
     * @param session the session in witch the file is put
     * @return
     * @throws IOException
     */
    public Menu exe(StringBuilder stringBuilder3, OpenedFiles openedFiles) throws IOException {
        setEe(ee);
        setCommandName(commandName);
        setMapNum(mapNum);
        loadMapping(openedFiles,getMapNum());


        String[]fileNames=stringBuilder3.toString().split(" ");
        for (String s:fileNames)
        {
            if (openedFiles.CheckNamesOfOpenedFiles(s)){
                session.addFile(getMapNum(),openedFiles.NamesOfOpenedFiles(s));
                System.out.println("Image "+s+" added");
            }
            else {return null;}
        }

        Scanner scanner=new Scanner(System.in);


        scanner.useDelimiter("\n");

        commandName.append(scanner.next());

        while(ee.commandExist(takeCommand(commandName))){
        ee.commands(takeCommand(commandName),session,mapNum);
            commandName.delete(0,getCommandName().length());
            commandName.append(scanner.next());
        }
        this.mapNum=0;
      return null;
    }
}
