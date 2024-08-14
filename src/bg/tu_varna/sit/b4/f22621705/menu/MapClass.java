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
    private OpenedFiles openedFiles;
    private Session session;
    private CreateFiles createFiles=new CreateFiles();

    public void getSession2(Session session) {
        if (session==null){
            this.session=new Session();
        }else this.session=session;
    }

    public MapClass() throws CommandException{
    }

    public void setSession(OpenedFiles openedFiles) {
        if (openedFiles==null){
            this.openedFiles=new OpenedFiles();
        }else this.openedFiles = openedFiles;
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

    /**
     *
     * @param string The command written
     * @return returns the execute function of the wanted command
     * @throws IOException
     * @throws CommandException
     */
    public Menu commands() throws IOException, CommandException {
        setSession(openedFiles);
        getSession2(session);
        createFiles.setE(this);
        createFiles.putInMap(openedFiles,session);
        Scanner scanner=new Scanner(System.in);
        String commandName="";
        while(!Objects.equals(commandName, "exit")){
            System.out.println(">"+commandName);
            commandName=scanner.next();
            goToCommand(commandName).execute();}
        return null;
    }
    public void aa() throws IOException {
        Menu a=aaa();
        a.execute();
    }
    public abstract Menu aaa ();
}
