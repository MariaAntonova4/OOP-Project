package bg.tu_varna.sit.b4.f22621705;

import bg.tu_varna.sit.b4.f22621705.load.Session;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class MapClass {
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        if (session==null){
            this.session=new Session();
        }else this.session = session;
    }
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

    public Menu goToCommand(String string) throws CommandException {

        for (Map.Entry<String, Menu> element : mapABC.entrySet()) {
            if (getMapABC().containsKey(string)) {
                if (Objects.equals(element.getKey(), string)) {
                    return element.getValue();
                }else {throw new CommandException("There is no such command");}
            }
        }return null;}

    public Menu commands(String string) throws IOException {
       // goToCommand(string);
        //session=new Session();
        setSession(session);
        return goToCommand(string).execute(session);
    }
    public void aa() throws IOException {
        Menu a=aaa();
        a.execute(session);
    }
    public abstract Menu aaa ();
}
