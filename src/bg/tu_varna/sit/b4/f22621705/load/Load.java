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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Load {
    StringBuilder commandName;
    private int mapNum;
    private Session session;

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

    private ConnectWithLoadCommands ee;

    public ConnectWithLoadCommands getEe() {
        return ee;
    }

    public void setEe(ConnectWithLoadCommands ee) {
        if (ee==null){
            this.ee=new ConnectWithNegative();
        }
        else this.ee = ee;
    }

    /**
     * adds the commands of the load command
     */
    public void loadMapping(OpenedFiles openedFiles1,int numberMap){
        getEe().putLoad("negative",new ConnectWithNegative().aAA());
        getEe().putLoad("rotate",new RotationConnection(getCommandName()).aAA());
        getEe().putLoad("grayscale",new ConnectWithGrayscale().aAA());
        getEe().putLoad("monochrome",new ConnectWithMonochrome().aAA());
        getEe().putLoad("undo",new ConnectUndo(this).aAA());
        getEe().putLoad("add",new ConnectWithAdd(openedFiles1,getCommandName()).aAA());
        getEe().putLoad("session info",new SessionConnection().aAA());
        getEe().putLoad("switch",new LoadSwitch(this).aAA());
        getEe().putLoad("collage",new ConnectWithCollage(openedFiles1,getCommandName()).aAA());
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
