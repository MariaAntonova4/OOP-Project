package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public abstract class MapClass {
    private StringBuilder stringBuilder;
    private OpenedFiles openedFiles;
    private Session session;
    private CreateFiles createFiles=new CreateFiles();

    public void setSession2(Session session) {
         this.session=session;
    }

    public MapClass() throws CommandException{
    }
    private Map<String, Menu> mapABC=new HashMap<>();

    public Map<String, Menu> getMapABC() {
        return mapABC;
    }

    public void setMapABC(Map<String, Menu> mapABC) {
        this.mapABC = mapABC;
    }

    public void puttingInMap(String string, Menu a){
        mapABC.put(string,a);
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

        for (Map.Entry<String, Menu> element : mapABC.entrySet()) {
            if (getMapABC().containsKey(string)) {
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
           // System.out.println(">"+commandName);
            goToCommand(takeCommand(stringBuilder)).execute();
            stringBuilder.delete(0, stringBuilder.length());

            stringBuilder.append(scanner.next());
            }
        return null;
    }
    public void aa() throws IOException, CommandException {
        Menu a=aaa();
        a.execute();
    }
    public abstract Menu aaa ();
}
