package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Load extends Menu {
    private Map<Integer, Set<String>> loadMap=new HashMap<>();
    private int mapNumber;
    private ListOfImages listOfImages;

    public Load() {
        this.mapNumber = 1;
        //this.listOfImages=new ListOfImages(fileName);
    }

    public Map<Integer, Set<String>> getLoadMap() {
        return loadMap;
    }

    public void setLoadMap(Map<Integer, Set<String>> loadMap) {
        this.loadMap = loadMap;
    }

    public Menu addInLoadMap(String fileName){

        if (listOfImages==null){
            listOfImages=new ListOfImages().addImageInSession(fileName);
        }
        if (listOfImages.checkImageInSession(fileName)){
        loadMap.put(mapNumber,listOfImages.getImagesInSession());}
        return null;
    }
}
