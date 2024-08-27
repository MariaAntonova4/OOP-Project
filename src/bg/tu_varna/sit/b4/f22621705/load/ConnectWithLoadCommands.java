package bg.tu_varna.sit.b4.f22621705.load;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class ConnectWithLoadCommands {
    private Map<String, LoadCommands>loaaad=new HashMap<>();

    public void putLoad(String command, LoadCommands aa){
        loaaad.put(command,aa);
    }

    /**
     *
     * @param commandName the name of the command
     * @return true if the command exists and false if it doesn't
     */
    public boolean commandExist(String commandName){
        for (Map.Entry<String, LoadCommands> element : loaaad.entrySet()) {
            if (loaaad.containsKey(commandName)) {
                if (Objects.equals(element.getKey(), commandName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param string the name of the command
     * @return returns the function which has to be executed of the command
     */
    public LoadCommands goToCommand(String string){

        for (Map.Entry<String, LoadCommands> element : loaaad.entrySet()) {
            if (loaaad.containsKey(string)) {
                if (Objects.equals(element.getKey(), string)) {
                    return element.getValue();
                }
            }
        }return null;}

    public LoadCommands commands(String string, Session session,int sessionNumber) throws IOException {
        return goToCommand(string).executeLoad(session,sessionNumber);
    }


    public void aA(Map<Integer, Set<String>> session){
        LoadCommands aa=aAA();
        //aa.executeLoad(session);
    }
    public abstract LoadCommands aAA();
}
