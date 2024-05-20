package bg.tu_varna.sit.b4.f22621705.additionalClasses;

import bg.tu_varna.sit.b4.f22621705.load.Load;
import bg.tu_varna.sit.b4.f22621705.open.FileOpen;
import bg.tu_varna.sit.b4.f22621705.save.SaveInFile;

import java.io.IOException;
import java.util.*;

public class Men {/*
   // private List commandList=new ArrayList<>();
    public HashMap<String, Men>menu=new HashMap<>();
    public static Men open () throws IOException {
        String fileName;
        System.out.println("Please enter the name of the file which you want to open: ");
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();

        return new FileOpen().readFile(fileName);
    }
    public static Men save(){
        return new SaveInFile();
    }
    public Men load(){
        String fileName;
        System.out.println("Please enter the name of the file which you want to load: ");
        Scanner scanner=new Scanner(System.in);
        fileName=scanner.nextLine();


        return new Load().addInLoadMap(fileName);
    }
    public boolean checkCommand(String menuCommand){
        return menu.containsKey(menuCommand);
    }
    public Men bbp(String command){
        if (checkCommand(command)){

            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, Men> element : menu.entrySet()) {
                if (Objects.equals(element.getKey(), command)){
                    System.out.println(element.getValue());
                    return element.getValue();
                }
                /*result.append("Game: ");
                result.append(": pleyers: ");
                result.append(element.getValue());
                result.append("\n");

                END comment


            }
        }
        System.out.println("There is no such command");
            return null;
    }
    public void menuCreator() throws IOException {
        menu.put("save",save());
        //menu.put("load",load());
        menu.put("open",open());
    }*/
}
