package bg.tu_varna.sit.b4.f22621705.menu.models.load.factories;

import bg.tu_varna.sit.b4.f22621705.files.NetpbmFiles.PixelException;
import bg.tu_varna.sit.b4.f22621705.files.Session;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.DirectionException;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.LoadMenu;
import bg.tu_varna.sit.b4.f22621705.menu.models.load.models.switchh.SwitchException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class LoadMenuLauncher {

    private Map<String, LoadMenu>loadMenu=new HashMap<>();

    public void putLoad(String command, LoadMenu loadMenu2){
        loadMenu.put(command,loadMenu2);
    }


    /**
     *
     * @param commandName the name of the command
     * @return true if the command exists and false if it doesn't
     */
    public boolean commandExist(String commandName){
        for (Map.Entry<String, LoadMenu> element : loadMenu.entrySet()) {
            if (loadMenu.containsKey(commandName)) {
                if (Objects.equals(element.getKey(), commandName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param string the name of the command
     * @return returns the function which has to be executed of the command
     */
    public LoadMenu goToCommand(String string){

        for (Map.Entry<String, LoadMenu> element : loadMenu.entrySet()) {
            if (loadMenu.containsKey(string)) {
                if (Objects.equals(element.getKey(), string)) {
                    return element.getValue();
                }
            }
        }return null;}

    public LoadMenu commands(String string, Session session, int sessionNumber) throws IOException, PixelException, SwitchException, DirectionException {
        return goToCommand(string).executeLoad(session,sessionNumber);
    }


    public void launchLoadMenu(Map<Integer, Set<String>> session){
        LoadMenu loadMenu=executeLoadCommand();
        //loadMenu.executeLoad();
    }
    public abstract LoadMenu executeLoadCommand();
}
