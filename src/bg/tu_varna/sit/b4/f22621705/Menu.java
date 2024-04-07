package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.util.*;

public class Menu {
    public HashMap<String,Object>menu=new HashMap<>();

    public FileOpen open (){
        return new FileOpen();
    }
    public SaveInFile save(){
        return new SaveInFile();
    }
    public boolean checkCommand(String menuCommand){
        return menu.containsKey(menuCommand);
    }

    public void menuCreator(String commandString, Object object){
        menu.put("save",save());
        menu.put("open", open());
    }
}
