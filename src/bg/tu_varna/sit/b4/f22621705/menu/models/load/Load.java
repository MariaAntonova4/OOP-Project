package bg.tu_varna.sit.b4.f22621705.menu.models.load;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.models.MainCommandExecute;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.factories.LoadMenuLauncher;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.add.Add;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.collage.Collage;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.grayscale.Grayscale;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.monochrome.Monochrome;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.negative.Negative;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.rotate.Rotate;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.session_info.SessionInfo;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.Switchh;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.undo.Undo;

import java.io.IOException;
import java.util.*;


public class Load {
    StringBuilder commandName;
    private int mapNum;
    private Session session;
    private LoadCommands loadCommand;
    private LoadMenuLauncher loadMenuLauncher;
    public Load(Session session) {
        this.session = session;
        this.loadCommand= LoadCommands.SESSION_INFO;
    }
    public StringBuilder getCommandName() {
        return commandName;
    }

    public void setCommandName(StringBuilder commandName) {
        if (commandName==null){
            this.commandName=new StringBuilder();
        }
       else this.commandName = commandName;
    }

    public int getMapNum() {
        return mapNum;
    }

    /**
     *
     * @param mapNum the new session number
     *               if there is not a number, one is written. The information is taken from
     *               the console.
     */
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

    public LoadMenuLauncher getLoadMenuLauncher() {
        return loadMenuLauncher;
    }

    public void setLoadMenuLauncher(LoadMenuLauncher loadMenuLauncher) {
        if (loadMenuLauncher==null){
            this.loadMenuLauncher=new LoadMenuLauncher();
        }
        else this.loadMenuLauncher = loadMenuLauncher;
    }

    /**
     * adds the commands of the load menu
     */
    public void loadMapping(OpenedFiles openedFiles1,int numberMap){
        getLoadMenuLauncher().putLoad(LoadCommands.NEGATIVE.getLoadCommand(), new Negative());
        getLoadMenuLauncher().putLoad(LoadCommands.ROTATE.getLoadCommand(), new Rotate(getCommandName()));
        getLoadMenuLauncher().putLoad(LoadCommands.GRAYSCALE.getLoadCommand(), new Grayscale());
        getLoadMenuLauncher().putLoad(LoadCommands.MONOCHROME.getLoadCommand(), new Monochrome());
        getLoadMenuLauncher().putLoad(LoadCommands.UNDO.getLoadCommand(), new Undo(this));
        getLoadMenuLauncher().putLoad(LoadCommands.ADD.getLoadCommand(), new Add(openedFiles1,getCommandName()));
        getLoadMenuLauncher().putLoad(LoadCommands.SESSION_INFO.getLoadCommand(), new SessionInfo());
        getLoadMenuLauncher().putLoad(LoadCommands.SWITCH.getLoadCommand(), new Switchh(this,getCommandName()));
        getLoadMenuLauncher().putLoad(LoadCommands.COLLAGE.getLoadCommand(), new Collage(openedFiles1,getCommandName()));
    }

    /**
     *
     * @param stringBuilder of the commands and the additional data
     * @return the command's name
     * Checks if the commands name has more data. If there isn't the command's name is returned.
     * If there is the first word is returned (the command's name). If the string builder is
     * "session info" it is returned "session info"
     */
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
     * @param stringBuilder3- the command with the names of the files
     * @param openedFiles set of all opened files
     * @return
     * @throws IOException
     * the method writes a new map number and load all the commands from the other menu.
     * Separates the name of the files and checks if they are open. If one of them is not
     * the program returns in the main menu. The files are putted in the session. In the console
     * is written new command. If the command exists it is called. After the execution of the
     * command the stringBuilder is cleaned and a new command is written in it from the console.
     * The method continues until the commands are in the menu.
     */
    public MainCommandExecute exe(StringBuilder stringBuilder3, OpenedFiles openedFiles) throws IOException, PixelException, SwitchException, DirectionException {
        setLoadMenuLauncher(loadMenuLauncher);
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

        while(loadMenuLauncher.commandExist(takeCommand(commandName))){
        loadMenuLauncher.commands(takeCommand(commandName),session,mapNum);
            commandName.delete(0,getCommandName().length());
            commandName.append(scanner.next());
        }
        this.mapNum=0;
      return null;
    }
}
