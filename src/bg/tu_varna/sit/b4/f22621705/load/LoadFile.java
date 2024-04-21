package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.Menu;

import java.util.*;

public abstract class LoadFile {
    private Map<Integer, ListOfImages>loadMap=new HashMap<>();
    public LoadFile(Map<Integer, ListOfImages> loadMap) {
        this.loadMap = loadMap;
    }
}
