package bg.tu_varna.sit.b4.f22621705.menu.factories;

import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.CommandException;
import bg.tu_varna.sit.b4.f22621705.menu.CreateFiles;
import bg.tu_varna.sit.b4.f22621705.menu.models.Menu;
import bg.tu_varna.sit.b4.f22621705.files.OpenedFiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public abstract class MenuLauncher {
    private StringBuilder stringBuilder;
    private OpenedFiles openedFiles;
    private Session session;
    private CreateFiles createFiles=new CreateFiles();
    private Map<String, Menu> menuMap=new HashMap<>();

    public MenuLauncher() throws CommandException {
    }
    public void setSession(Session session) {
        this.session=session;
    }

    public Map<String, Menu> getMenuMap() {
        return menuMap;
    }

    public void puttingInMap(String commandName, Menu menu){
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
     * @throws CommandException
     */
    public Menu goToCommand(String string) throws CommandException {
        for (Map.Entry<String, Menu> element : menuMap.entrySet()) {
            if (getMenuMap().containsKey(string)) {
                if (Objects.equals(element.getKey(), string)) {
                    return element.getValue();
                }
            }else {throw new CommandException("There is no such command");}
        }return null;}
    public void updateMenu() throws CommandException {
        createFiles.putInMap(getOpenedFiles(),getSession(),getStringBuilder());
    }
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
     * @param string The command written
     * @return returns the execute function of the wanted command
     * @throws IOException
     * @throws CommandException
     */
    public Menu commands() throws IOException, CommandException {
        createFiles.setE(this);
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
    public void launchMenu() throws IOException, CommandException {
        Menu menu=executeCommand();
        menu.execute();
    }
    public abstract Menu executeCommand ();
}
