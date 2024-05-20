package bg.tu_varna.sit.b4.f22621705;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class MapClass {
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

    public Menu goToCommand(String string){

        for (Map.Entry<String, Menu> element : mapABC.entrySet()) {
            if (getMapABC().containsKey(string)) {
                if (Objects.equals(element.getKey(), string)) {
                    return element.getValue();
                }
            }
        }return null;}

    public Menu commands(String string) throws IOException {
       // goToCommand(string);
        return goToCommand(string).execute();
    }
    public void aa() throws IOException {
        Menu a=aaa();
        a.execute();
    }
    public abstract Menu aaa ();
}
