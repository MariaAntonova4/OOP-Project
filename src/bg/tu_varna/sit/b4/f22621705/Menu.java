package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;
import java.util.*;

public class Menu {
    public HashMap<String,Menu>menu=new HashMap<>();

    public static Menu open () throws IOException {
        String fileName;
        System.out.println("Please enter the name of the file which you want to open: ");
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.next();
        scanner.close();
        return new FileOpen().readFile(fileName);
    }
    public static Menu save(){
        return new SaveInFile();
    }
    public boolean checkCommand(String menuCommand){
        return menu.containsKey(menuCommand);
    }
    public Menu bbp(String command){
        if (checkCommand(command)){
            System.out.println("IM HERE");
            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, Menu> element : menu.entrySet()) {
                if (Objects.equals(element.getKey(), command)){
                    System.out.println(element.getValue());
                    return element.getValue();
                }
                /*result.append("Game: ");
                result.append(": pleyers: ");
                result.append(element.getValue());
                result.append("\n");*/
            }
        }
            return null;
    }
    public void menuCreator() throws IOException {
        menu.put("save",save());
        menu.put("open",open());
    }
}
