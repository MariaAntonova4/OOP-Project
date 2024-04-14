package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.util.*;

public class Menu {
    public HashMap<String,Menu>menu=new HashMap<>();

    public Menu open (){
        return new FileOpen();
    }
    public Menu save(){
        return new SaveInFile();
    }
    public boolean checkCommand(String menuCommand){
        return menu.containsKey(menuCommand);
    }
    public String bbp(String command){
        if (checkCommand(command)==true){
            System.out.println("IM HERE");
            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, Menu> element : menu.entrySet()) {
                result.append("Game: ");
                result.append(element.getKey());
                result.append(": pleyers: ");
                result.append(element.getValue());
                result.append("\n");
            }

            return result.toString();
        }
        else return ":(";
    }
    public void menuCreator(String commandString, Object object){
        menu.put("save",save());
        menu.put("open", open());
    }
}
