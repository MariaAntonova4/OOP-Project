package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.IOException;
import java.util.*;


public class Load {
    private EE ee;

    public EE getEe() {
        return ee;
    }

    public void setEe(EE ee) {
        this.ee = ee;
    }

    private Map<Integer, Set<String>> loadMap=new HashMap<>();
    private int mapNumber;
    private ListOfImages listOfImages;

    public Load() {
        this.mapNumber = 1;
        //this.listOfImages=new ListOfImages(fileName);
    }

    public void printSession(){
        }
    public Map<Integer, Set<String>> getLoadMap() {
        return loadMap;
    }

    public void setLoadMap(Map<Integer, Set<String>> loadMap) {
        this.loadMap = loadMap;
    }

    public Menu addInLoadMap(String fileName) throws IOException {

        if (listOfImages==null){
            listOfImages=new ListOfImages().addImageInSession(fileName);
        }
        if (listOfImages.checkImageInSession(fileName)){
            getLoadMap().put(mapNumber,listOfImages.getImagesInSession());}
        return exe(getLoadMap());
    }

    public void loadMapping(){
        getEe().putLoad("monochrome",new HH().aAA());
        getEe().putLoad("negative",new FF().aAA());
        getEe().putLoad("grayscale",new GG().aAA());

    }

    public Menu exe(Map<Integer, Set<String>> session) throws IOException {
        setEe(new FF());
        loadMapping();

        Scanner scanner=new Scanner(System.in);
        String commandName;
        System.out.println("Please write the LOAD command you want to be executed: ");
        commandName=scanner.next();
        ee.commands(commandName,session);


      return null;
    }
}
