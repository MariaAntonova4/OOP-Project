package bg.tu_varna.sit.b4.f22621705.menu;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles;
import bg.tu_varna.sit.b4.f22621705.load.Session;
import bg.tu_varna.sit.b4.f22621705.open.OpenedFiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class MapClass {
    private OpenedFiles openedFiles;

    /*public Session getSession() {
        return session;
    }*/

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
    public Menu commands(String string) throws IOException, CommandException {
        setSession(openedFiles);
        return goToCommand(string).execute(openedFiles);
    }
    public void aa() throws IOException {
        Menu a=aaa();
        a.execute(openedFiles);
    }
    public abstract Menu aaa ();
}
