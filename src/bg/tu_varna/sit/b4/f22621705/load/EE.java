package bg.tu_varna.sit.b4.f22621705.load;

import bg.tu_varna.sit.b4.f22621705.Menu;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class EE {
    private Map<String,AA>loaaad=new HashMap<>();

    public void putLoad(String command,AA aa){
        loaaad.put(command,aa);
    }

    public AA goToCommand(String string){

        for (Map.Entry<String, AA> element : loaaad.entrySet()) {
            if (loaaad.containsKey(string)) {
                if (Objects.equals(element.getKey(), string)) {
                    return element.getValue();
                }
            }
        }return null;}

    public AA commands(String string,Map<Integer, Set<String>> session) throws IOException {
        return goToCommand(string).executeLoad(session);
    }


    public void aA(Map<Integer, Set<String>> session){
        AA aa=aAA();
        //aa.executeLoad(session);
    }
    public abstract AA aAA();
}
