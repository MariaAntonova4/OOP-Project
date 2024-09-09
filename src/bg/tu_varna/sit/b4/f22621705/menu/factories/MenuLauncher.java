package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.CreateMap;
import bg.tu_varna.sit.b4.f22621705.menu.models.MainCommandExecute;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class MenuLauncher {
    private StringBuilder stringBuilder;
    private OpenedFiles openedFiles;
    private Session session;
    private CreateMap createMap=new CreateMap();
    private Map<String, MainCommandExecute> menuMap=new HashMap<>();

    public MenuLauncher() throws CommandException {
    }
    public void setSession(Session session) {
        this.session=session;
    }

    public Map<String, MainCommandExecute> getMenuMap() {
        return menuMap;
    }

    public void puttingInMap(String commandName, MainCommandExecute menu){
        menuMap.put(commandName,menu);
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        if (stringBuilder==null){
            this.stringBuilder=new StringBuilder();
        }
        else this.stringBuilder = stringBuilder;
    }

    public void setOpenedFiles(OpenedFiles openedFiles) {
         this.openedFiles = openedFiles;
    }

    public OpenedFiles getOpenedFiles() {
        return openedFiles;
    }

    public Session getSession() {
        return session;
    }

    /**
     *
     * @param string command
     * @return returns the command if there is any
     * @throws CommandException catches if the command is not written correctly
     *checks if the command exists
     */
    public MainCommandExecute goToCommand(String string) throws CommandException {
        for (Map.Entry<String, MainCommandExecute> element : menuMap.entrySet()) {
            if (getMenuMap().containsKey(string)) {
                if (Objects.equals(element.getKey(), string)) {
                    return element.getValue();
                }
            }else {throw new CommandException("There is no such command");}
        }return null;}

    /**
     * updates the map with new data
     * @throws CommandException catches if the command is not written correctly
     */
    public void updateMenu() throws CommandException, PixelException, SwitchException, IOException, DirectionException {
        createMap.putInMap(getOpenedFiles(),getSession(),getStringBuilder());
    }

    /**
     *
     * @param stringBuilder the command
     * @return string
     * the function checks if the commands name has more data. If there
     * isn't, the command's name is returned. If there is the first word
     * is returned (the command's name). If the string builder is "save
     * as" it is returned "save as"
     */
    public String takeCommand(StringBuilder stringBuilder){
        if (stringBuilder.toString().contains("save as")){
            return "save as";
        } else if (stringBuilder.toString().contains(" ")) {
            return stringBuilder.substring(0, stringBuilder.indexOf(" "));
        }
        else return stringBuilder.toString();
    }
    /**
     *
     * @return returns the execute function of the wanted command
     * @throws IOException
     * @throws CommandException catches the wrong commands
     * the method creates the menu and waits for a command to be written. Then checks if
     * the command exists and if it does, calls the method of the wanted command. When
     * the function ends the string builder is cleaned and a new command from the console
     * is written
     */
    public MainCommandExecute commands() throws IOException, CommandException, PixelException, SwitchException, DirectionException {
        createMap.setMenuLauncher(this);
        updateMenu();
        Scanner scanner=new Scanner(System.in);
        scanner.useDelimiter("\n");

        stringBuilder.append(scanner.next());
        while(!Objects.equals(takeCommand(stringBuilder), "exit")){
            goToCommand(takeCommand(stringBuilder)).execute();
            stringBuilder.delete(0, stringBuilder.length());

            stringBuilder.append(scanner.next());
            }
        return null;
    }
}
