package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.Menu;
import bg.tu_varna.sit.b4.f22621705.load.add.ZZ;
import bg.tu_varna.sit.b4.f22621705.load.grayscale.GG;
import bg.tu_varna.sit.b4.f22621705.load.monochrome.KK;
import bg.tu_varna.sit.b4.f22621705.load.negative.HH;
import bg.tu_varna.sit.b4.f22621705.load.rotate.FF;
import bg.tu_varna.sit.b4.f22621705.load.session_info.PP;
import bg.tu_varna.sit.b4.f22621705.load.undo.XX;

import java.io.IOException;
import java.util.*;


public class Load {
    private Map<Integer, Set<String>> session=new HashMap<>();
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

    public int getMapNumber() {
        return mapNumber;
    }

    public void setMapNumber(int mapNumber) {
        this.mapNumber = mapNumber;
    }
    public Map<Integer, Set<String>> getLoadMap() {
        return loadMap;
    }

    public void setLoadMap(Map<Integer, Set<String>> loadMap) {
        this.loadMap = loadMap;
    }

    public void addInLoadMap(String fileName) throws IOException {

        if (listOfImages==null){
            listOfImages=new ListOfImages().addImageInSession(fileName);
        }
        if (listOfImages.checkImageInSession(fileName)){
            getLoadMap().put(mapNumber,listOfImages.getImagesInSession());}
        session=getLoadMap();
    }

    public void loadMapping(){
        getEe().putLoad("negative",new HH().aAA());
        getEe().putLoad("rotate",new FF().aAA());
        getEe().putLoad("grayscale",new GG().aAA());
        getEe().putLoad("monochrome",new KK().aAA());
        getEe().putLoad("undo",new XX().aAA());
        getEe().putLoad("add",new ZZ().aAA());
        getEe().putLoad("session_info",new PP().aAA());
    }

    public Menu exe(String fileName) throws IOException {
        setEe(new FF());
        loadMapping();
        addInLoadMap(fileName);
        System.out.println("Session with ID:");
        Scanner scannerNum=new Scanner(System.in);
        int mapNum= Integer.parseInt(scannerNum.next());
        setMapNumber(mapNum);
        Scanner scanner=new Scanner(System.in);
        String commandName;

        System.out.println("Please write the LOAD command you want to be executed: ");
        commandName=scanner.next();

        while(ee.commandExist(commandName)){
        ee.commands(commandName,session);
            System.out.println("Please write the LOAD command you want to be executed: ");
            commandName=scanner.next();
        }

      return null;
    }
}
